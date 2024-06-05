package com.example.manajemen_buku_perpus

data class Book(val id: String, val title: String, val image: Int, val author: String)

data class BukuManajemen(val book: Book, val returnDate: String, val timeLeftPercentage: Float)

val bookItems = listOf(
    Book("001", "Muscle", R.drawable.book_muscle, "Alan Trotter"),
    Book("002", "Muscle", R.drawable.book_dominicana, "Angie Cruz"),
    Book("003", "Muscle", R.drawable.book_a_new, "Shelly Kaine"),

)

val bukuPinjaman = listOf(
    BukuManajemen(
        Book("001", "Just My Type", R.drawable.book_just_my_type, "Simon Garfield"),
        "25.10.2024",
        75f
    ),
    BukuManajemen(
        Book("002", "Don't Make Me Think", R.drawable.book1, "Steve Krug"),
        "05.11.2022",
        75f
    ),
    BukuManajemen(
        Book("003", "The Road To React", R.drawable.book2, "Steve Krug"),
        "02.5.2024",
        75f
    ),
    BukuManajemen(
        Book("004", "Rich Dad Poor Dad", R.drawable.book3, "Robert T.Kiyosaki"),
        "15.6.2022",
        75f
    ),
    BukuManajemen(
        Book("005", "Muscle", R.drawable.book_dominicana, "Alan Trotter"),
        "25.03.2024",
        75f
    ),
    BukuManajemen(
        Book("006", "Graphic Design", R.drawable.book_a_new, "David Reinfurt"),
        "14.07.2022",
        75f
    ),
    BukuManajemen(
        Book("007", "Dominicana", R.drawable.book_muscle, "Angie Cruz"),
        "19.06.2024",
        75f
    ),
)

val bukuKembali = listOf(
    BukuManajemen(
        Book("001", "Just My Type", R.drawable.book_just_my_type, "Simon Garfield"),
        "25.10.2024",
        75f
    ),
    BukuManajemen(
        Book("002", "Don't Make Me Think", R.drawable.book1, "Steve Krug"),
        "05.11.2022",
        75f
    ),
    BukuManajemen(
        Book("003", "The Road To React", R.drawable.book2, "Steve Krug"),
        "02.5.2024",
        75f
    ),
    BukuManajemen(
        Book("004", "Rich Dad Poor Dad", R.drawable.book3, "Robert T.Kiyosaki"),
        "15.6.2022",
        75f
    ),
    BukuManajemen(
        Book("005", "Muscle", R.drawable.book_dominicana, "Alan Trotter"),
        "25.03.2024",
        75f
    ),
    BukuManajemen(
        Book("006", "Graphic Design", R.drawable.book_a_new, "David Reinfurt"),
        "14.07.2022",
        75f
    ),
    BukuManajemen(
        Book("007", "Dominicana", R.drawable.book_muscle, "Angie Cruz"),
        "19.06.2024",
        75f
    ),
)