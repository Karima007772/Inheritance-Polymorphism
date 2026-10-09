##  Encapsulation

Encapsulation yaitu cara menyembunyikan data di dalam kelas supaya tidak bisa diubah sembarangan dari luar. Di kode ini saya membuat atribut seperti `color`, `side`, `radius`, dan `height` tidak dibuat public, melainkan `private` atau `protected`. Untuk mengakses atau mengubahnya, harus lewat method getter dan setter. Contohnya seperti, `side` di kelas `Square` bersifat private, jadi untuk mengubah nilainya kita harus pakai `setSide()`, dan untuk membacanya pakai `getSide()`. Dengan begitu, data yang sudah saya buat di dalam objek tetap terjaga dan tidak bisa diubah menjadi nilai yang tidak valid.


## Inheritance

Inheritance itu konsep pewarisan, di mana ketika saya membuat sebuah  kelas yang bisa mewarisi atribut dan method dari kelas lain. Di program ini saya juga membuat beberapa kelas diantaranya:  `Square` dan `Circle` mewarisi kelas `Shape`, sedangkan `Cylinder` mewarisi kelas `Circle`. Jadi, `Square` dan `Circle` otomatis punya atribut `color` dan method dari `Shape` tanpa perlu menulis ulang. Begitu juga `Cylinder` yang otomatis punya `radius` dan method `area()` dari `Circle`. Setiap constructor di kelas anak memanggil `super(...)` untuk menginisialisasi bagian dari kelas induknya terlebih dahulu, baru kemudian menginisialisasi atributnya sendiri. Contohnya, constructor `Cylinder` memanggil `super(radius, color)` untuk mengurus bagian `Circle`, lalu baru menyimpan nilai `height` miliknya sendiri, begitu kurang lebih.


##  Polymorphism

Polymorphism artinya satu method bisa punya banyak bentuk perilaku. Di kode ini saya membuat setiap kelas punya method `printInfo()`, tapi isinya berbeda-beda. `Square` menampilkan luas persegi, `Circle` menampilkan luas lingkaran, dan `Cylinder` menampilkan volume silinder. Meskipun nama method yang saya buat itu sama semua tapi hasil output-nya berbeda sesuai objek yang memanggilnya. Ini disebut method overriding, dan ditandai dengan `@Override` di atas method. Dari output program terlihat bahwa `printInfo()` yang dipanggil pada objek `Square`, `Circle`, dan `Cylinder` menghasilkan tiga baris output yang berbeda, walaupun nama method-nya sama. Inilah yang disebut Runtime Polymorphism, di mana Java menentukan method mana yang dijalankan berdasarkan objek aslinya, bukan tipe variabelnya.

