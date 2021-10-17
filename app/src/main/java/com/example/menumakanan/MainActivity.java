package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> FotoMakanan = new ArrayList<>();
    private ArrayList<String> NamaMakanan = new ArrayList<>();
    private ArrayList<String> InfoMakanan = new ArrayList<>();
    private ArrayList<String> HargaMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(FotoMakanan, NamaMakanan, InfoMakanan, HargaMakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void getDataFromInternet(){
        NamaMakanan.add("Sate Taichan");
        FotoMakanan.add("https://cdn.yukepo.com/content-images/main-images/2017/07/07/main_image_9817.jpg");
        InfoMakanan.add("Sate Taichan adalah modifikasi makanan dari sate biasa yang tidak menggunakan bumbu kacang");
        HargaMakanan.add("Harga : Rp 20.000");

        NamaMakanan.add("Martabak");
        FotoMakanan.add("https://lh6.googleusercontent.com/proxy/EpsMoOIfnh0VnMbMQ-4VorCs2FcQLprdseq6MwjArBnKAYwlulXrew179lNoUPH50aJwGLW_7SSW0iRY6M7L5WqXTugBPldpHu_HOK4e_aTcbqXWEoKXPPtr0b8ahrQy-F9DnhtUjjWmS9Ue6SpjrHA=w1200-h630-p-k-no-nu");
        InfoMakanan.add("Martabak, sebuah omelet yang gurih dan pedas yang diisi potongan sayur dan daging cincang");
        HargaMakanan.add("Harga : Rp 15.000");

        NamaMakanan.add("Soto");
        FotoMakanan.add("https://th.bing.com/th/id/OIP.o2VXyivO_GnQwMCcpgK6pQHaFj?w=241&h=181&c=7&r=0&o=5&dpr=1.25&pid=1.7");
        InfoMakanan.add("Soto adalah makanan khas Indonesia yang terbuat dari kaldu daging dan sayuran. Daging yang paling sering digunakan adalah daging sapi dan ayam, tetapi juga babi dan kambing");
        HargaMakanan.add("Harga : Rp 13.000");

        NamaMakanan.add("Mie ayam");
        FotoMakanan.add("https://th.bing.com/th/id/OIP.KR-j1jE7wuGtLh46BWV3yAHaE6?w=282&h=187&c=7&r=0&o=5&dpr=1.25&pid=1.7");
        InfoMakanan.add("Adalah hidangan Indonesia yang terbuat dari mie gandum kuning yang dibumbui dengan daging ayam yang biasanya dipotong dadu");
        HargaMakanan.add("Harga : Rp 13.000");

        NamaMakanan.add("Tahu TekTek");
        FotoMakanan.add("https://th.bing.com/th/id/OIP.7M0MNnvLcykVePphmQ5DIQHaE6?w=264&h=180&c=7&r=0&o=5&dpr=1.25&pid=1.");
        InfoMakanan.add("Adalah makanan tradisional yang di dalamnya terdapat tahu goreng dan lontong yang dipotong kecil lalu disiram saus bumbu di atasny");
        HargaMakanan.add("Harga : Rp 15.000");

        NamaMakanan.add("Ayam Bakar");
        FotoMakanan.add("https://4.bp.blogspot.com/-ICsTm2-QHzo/V2qqP4237kI/AAAAAAAAJmA/bJFje_yxKDIv9eO3kk2kayMYYcDvQthWwCLcB/s1600/Cara%2BMembuat%2BAyam%2BBakar%2BBetutu%2BBali%2Bdan%2BResep.jpg");
        InfoMakanan.add("Ayam bakar adalah makanan paling lumrah dijumpai ketika berada di jalan,makanan yang berbahan dasar ayam yang dibakar dengan baluran kecap dan bumbu yang beraneka ragam.");
        HargaMakanan.add("Harga : Rp 22.000");

        prosesRecyclerViewAdapter();
    }
}