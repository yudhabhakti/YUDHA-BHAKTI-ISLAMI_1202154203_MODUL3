package com.example.asus.yudhabhaktiislami_1202154203_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListAirMineral extends AppCompatActivity {

    //menginisiasikan variable
    private RecyclerView recyclerView;
    private MenuAdapter mAdapter;

    public static ArrayList<ItemMenu> DATA;
    //agar activity dapat berfungsi dan akan bisa dipanggil oleh activity selanjutnya / pindah activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_air_mineral);
        //memanggil variable
        DATA = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList);
        mAdapter = new MenuAdapter(DATA);
        recyclerView.setAdapter(mAdapter);

        //menyeduasikan tampilan ketika emulator menjadi landscap
        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }
    // Untuk Menampung banyak data
    public ArrayList<ItemMenu> isi(){
        ArrayList<ItemMenu> data = new ArrayList<>();
        data.add(new ItemMenu("Aqua","Ini adalah AMDK merk AQUA","Aqua adalah air minum kemasan yang didirikan oleh Tirto Utomo, warga asli Wonosobo pada 1973. Tirto mendirikan pabrik pertamanya di Pondok Ungu, Bekasi, dengan nama Golden Missisippi. Kapasitas awal pabrik itu enam juta liter per tahun. Tirto sempat ragu dengan nama Golden Missisippi akhirnya mengganti dengan nama Aqua karena cocok terhadap label air minum dalam botol serta tidak sulit untuk diucapkan. ",R.drawable.aqua));
        data.add(new ItemMenu("Amidis","Ini adalah AMDK merk AMIDIS","AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan",R.drawable.amidis));
        data.add(new ItemMenu("Cleo","Ini adalah AMDK merk CLEO","Cleo adalah air murni berkadar kemurnian 99,99% mengandung oksigen sampai dengan 8mg/L @ 20°C. Air Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001 mikron sehingga tidak mengandung mikroorganisme dan mineral anorganik, misalnya chlorine dan natrium fluoride.",R.drawable.cleo));
        data.add(new ItemMenu("Club","Ini adalah AMDK merk CLUB","Club adalah produk perusahaan Grup Tirta Bahagia (TB) yang berdiri sejak akhir 80an. Saat ini, perusahaan itu telah di akuisisi oleh  PT Indofood CBP Sukses Makmur Tbk (ICBP) melalui dua anak usahanya PT Tirta Makmur Perkasa (TMP) dan PT Tirta Sukses Perkasa (TSP) sebesar Rp 2,2 triliun. Air minum ini awalnya hanya di pasarkan di Jawa Timur, Sekarang kita bisa melihatnya dimana-mana.",R.drawable.club));
        data.add(new ItemMenu("Equil","Ini adalah AMDK merk EQUIL","Equil adalah air minum yang cukup terkenal di kalangan menengah atas dan ekspatriat. Morgen Sutanto adalah pendiri  PT. Equilindo Lestari dan memulai usahanya tahun 1997. Ia melihat potensi air mineral murni cukup luas terbuka lebar. Para produsen lokal saat itu hanya bermain dalam produk air minum dalam kemasan (AMDK). Untuk air mineral premium masih dikuasai produk impor. Indonesia kaya akan mata air, akan sangat ironis kalau air pun harus mengimpor. Sekarang kita bisa melihat Equil hadir di meja restoran, hotel bintang lima, hingga meja Istana Negara saat rapat kabinet.",R.drawable.equil));
        data.add(new ItemMenu("Evian","Ini adalah AMDK merk EVIAN","Evian adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman. Saat ini Evian dimiliki oleh Groupe Danone, sebuah perusahaan multinasional Perancis",R.drawable.evian));
        data.add(new ItemMenu("Le Minerale","Ini adalah AMDK merk LE MINERALE","Le Minerale adalah air mineral baru dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami yang dibutuhkan tubuh sehari-hari. Le Minerale, diolah dari sumber mata air pegunungan terpilih, sehingga memiliki kesegaran khas yang ditandai dengan sedikit rasa manis",R.drawable.leminerale));
        data.add(new ItemMenu("Nestle","Ini adalah AMDK merk NESTLE","Dulu Nestle PureLife bernama Aberfoyle Springs karena diproduksinya oleh Aberfoyle Springs sejak tahun 1993. Namun pada 2002, Nestle membelinya dan mengganti namanya menjadi pun dilakukan menjadi Nestle Pure Life Natural Spring Water. Penjualan produk ini mencapai 5 juta air per hari. Hal yang menarik dari Nestle adalah dari proses pemurnian airnya. Begitupun dengan botol-botolnya, hingga mengalami 12 langkah pemurnian dan peningkatan kualitas.",R.drawable.nestle));
        data.add(new ItemMenu("Pristine","Ini adalah AMDK merk PRISTINE","PRISTINE bukan Air Mineral biasa karena PRISTINE bukan hanya sekedar menghilangkan dahaga, tapi juga bermanfaat bagi kesehatan. Dengan proses Ionisasi, suatu prosess dimana memisahkan air dan mineral menjadi ion molekul yang lebih kecil",R.drawable.pristine));
        data.add(new ItemMenu("Vit","Ini adalah AMDK merk VIT","VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta.",R.drawable.vit));
        return data;
    }
}