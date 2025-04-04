Kode di atas adalah sebuah simulasi sistem transportasi yang meniru bagaimana kendaraan umum seperti bus, kereta, dan taksi beroperasi dalam suatu perjalanan. Program ini berguna untuk memahami konsep OOP (Object-Oriented Programming) dalam pemrograman Java, khususnya dalam hal inheritance (pewarisan) dan polymorphism (polimorfisme).

# **Penjelasan Kegunaan Kode**
1. Membangun Struktur Transportasi dengan OOP
   
    Kode ini dirancang menggunakan konsep pewarisan (inheritance) di mana:
      + Vehicle (kendaraan) adalah kelas induk yang memiliki atribut dasar seperti nama kendaraan, kapasitas, jumlah penumpang, dan rute perjalanan.
      + Bus, Train, dan Taxi adalah turunan dari Vehicle, masing-masing memiliki cara perhitungan tarif yang berbeda.

Ini meniru bagaimana sistem transportasi bekerja di dunia nyata, di mana kendaraan memiliki karakteristik yang berbeda.

2. Menjalankan Simulasi Perjalanan
   
    Program ini memungkinkan kita untuk mensimulasikan skenario perjalanan dari tiga jenis kendaraan:

      + Memulai perjalanan dari rute yang telah ditentukan.
      + Menambahkan penumpang ke dalam kendaraan, dengan batas maksimum sesuai kapasitas.
      + Menghitung tarif perjalanan berdasarkan aturan unik masing-masing kendaraan:
        
            - Bus: Berdasarkan jumlah halte (Rp 2000 per halte per penumpang).
        
            - Kereta: Tarif tetap (Rp 10.000 per penumpang).
        
            - Taksi: Berdasarkan jarak tempuh (Rp 5000 per km).
        
      + Mengakhiri perjalanan ketika kendaraan mencapai tujuan.
      +  Menurunkan penumpang, dan menampilkan pesan jika tidak ada penumpang yang bisa diturunkan.

4. Studi Kasus yang Dapat Diterapkan
   
Kode ini dapat digunakan dalam berbagai skenario, seperti:

      + Simulasi operasional transportasi umum, misalnya untuk melihat bagaimana tarif dihitung dalam sistem bus atau kereta.
      +  Belajar konsep OOP dalam Java, terutama bagaimana menggunakan inheritance, method overriding, dan polymorphism.
      +  Mengembangkan sistem transportasi yang lebih kompleks, misalnya menambahkan fitur GPS, waktu perjalanan, atau sistem pemesanan tiket.

# **Kesimpulan**
Kode ini berguna sebagai simulasi sederhana sistem transportasi, yang dapat dikembangkan lebih lanjut untuk aplikasi nyata seperti sistem pemesanan tiket, manajemen rute transportasi, atau analisis biaya perjalanan. Jika ada fitur tambahan yang ingin ditambahkan, beri tahu aku, dan kita bisa mengembangkannya bersama!








