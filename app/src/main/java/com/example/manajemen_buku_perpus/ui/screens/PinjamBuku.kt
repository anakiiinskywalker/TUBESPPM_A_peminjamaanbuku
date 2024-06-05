package com.example.manajemen_buku_perpus.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.manajemen_buku_perpus.bookItems

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import com.example.manajemen_buku_perpus.bukuPinjaman

@Composable
fun PinjamBuku() {
   Column(modifier = Modifier.padding(top = 30.dp)) {
      UIText(text = "Buku Yang Sedang Di Pinjam", fontSize = 20.sp, modifier = Modifier.padding(horizontal = 20.dp))
      BukuPinjam2()
   }

}

@Composable
fun BukuPinjam2() {
   Spacer(modifier = Modifier.height(16.dp))
   LazyColumn(contentPadding = PaddingValues(vertical = 16.dp)) {
      items(bukuPinjaman) { book ->
         Row(
            Modifier
               .fillMaxWidth()
               .height(120.dp)
               .padding(horizontal = 28.dp, vertical = 8.dp)
               .clickable { },
            horizontalArrangement = Arrangement.spacedBy(16.dp)
         ) {
            Image(
               painter = painterResource(id = book.book.image),
               contentScale = ContentScale.FillHeight,
               contentDescription = "Cover",
               modifier = Modifier
                  .fillMaxHeight()
                  .clip(RoundedCornerShape(8.dp))
            )
            Column(Modifier.weight(1f)) {
               UIText(book.book.title, fontSize = 16.sp)
               UIText(book.book.author, fontSize = 16.sp, color = Color.Gray)
               Spacer(modifier = Modifier.weight(1f))
               UIText(
                  "Return until ${book.returnDate}",
                  color = MaterialTheme.colors.primary,
                  fontSize = 13.sp
               )
               LinearProgressIndicator(
                  book.timeLeftPercentage,
                  modifier = Modifier.fillMaxWidth()
               )
            }
            IconButton(onClick = { /*TODO*/ }) {
               Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "Menu")
            }
         }

      }
   }
}