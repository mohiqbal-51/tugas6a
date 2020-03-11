package com.iqbal.praktikum6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createResepData()
        resep_parts.layoutManager = LinearLayoutManager(this)
        resep_parts.setHasFixedSize(true)
        resep_parts.adapter = resepadapter(testData, { resepItem : dataresep -> resepItemClicked(resepItem) })
    }
    private fun resepItemClicked(resepItem : dataresep) {
        val showDetailActivityIntent = Intent(this, resepdetailactivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, resepItem.namaMakanan.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_SPLIT_NAME, resepItem.resepMakanan.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_REFERRER, resepItem.foto.toString())
        startActivity(showDetailActivityIntent)
    }
    private fun createResepData() : List<dataresep> {
        val partList = ArrayList<dataresep>()
        partList.add(
            dataresep("Gado-Gado","\tBahan:\n-\t2 1/4 kol iris tipis, rebus\n-\t 10 helai kacang panjang dipotong, rebus\n-\t1 genggam toge, rebus\n-\t1 buah timun dipotong\n-\t1 buah tahu kotak goreng\n-\ttomat\n-\tkentang rebus\n-\ttelur rebus\n-\tdaun selada\n-\tLontong" +
                "\n\n\tBahan Saus\n-\t100 gr kacang tanah\n-\t4 buah bawang putih\n-\t5 buah cabai kriting\n-\t100 gr gula merah sisir\n-\t4 sdm gula pasir\n-\t1 sdt air asam jawa\n-\t1/2 sdt garam" +
                "\n\n Cara Membuat:\n1.\tGoreng kacang tanah dan bawang putih hingga kecokelatan. Angkat.\n\t\tHaluskan semua bahan saus dengan chopper hingga benar-benar halus kecuali santan dan kecap manis\n2.\tMasukkan bahan saus di panci, tambahkan santan aduk-aduk hingga rata.\n3.\tMasak hingga hampir mendidih sambil terus diaduk.\n\t\tKentalkan dengan tepung beras yang sudah dicairkan, tambahkan kecap manis.\n4.\tAduk hingga mendidih. Angkat.\n\t\tTata sayuran yang sudah dipotong-potong, telur, tahu, dan lontong di piring.\n5.\tSiram dengan saus kacang. Taburi bawang goreng dan emping melinjo. Sajikan.", R.drawable.gado2)
        )
        partList.add(dataresep("Lontong Balap","\tBahan:\n-\t300 gr Tauge\n-\t5 siung bawang putih\n-\t4 siung bawang merah\n-\tsecukupnya daun bawang\n-\tsecukupnya daun seledri \n-\t 1 liter kaldu sapi \n-\t 2 sdm minyak untuk tumis \n-\t 1 sdt kaldu bubuk\n-\t 1/4 sdt lada bubuk \n-\t secukupnya garam dan gula\n-\t lontong, tahu goreng, lento kacang tolo, bawang goreng, kecap manis" , R.drawable.lntngblp))
        partList.add(dataresep("Tahu Tek","\tBahan:\n-\t3 sendok makan kacang tanah\n-\t1 sendok teh petis udang/petis madura\n-\t1/2 siung bawang putih\n-\t3 batang cabe rawit\n-\t1 butir telur ayam\n-\t3 buah tahu\n-\ttimun secukupnya\n-\ttauge secukupnya\n-\tbawang goreng secukupnya\n-\tkecap manis, lontong, garam", R.drawable.taute))
        partList.add(dataresep("Nasi Krawu","\tBahan:\n-\t500 gr nasi putih\n-\ttimun dan kemangi\n\t\tkrupuk\n-\t500 gr daging sapi\n-\t1 sdt garam\n-\t2 lembar daun salam\n-\t1 batang serai memarkan\n-\t5 siung bawang putih\n-\t10 buah bawang merah\n-\t2 sdt ketumbar\n-\t 1/4 sdt jintan\n-\t 1 cm lengkuas\n-\t 1 cm kunyit\n-\t 1 sdt garam\n-\t 2 sdt gula merah\n-\t 1/3 kelapa muda parut\n-\t 2 siung bawang putih\n-\t 1 sdt ketumbar\n-\t 3 lembar daun jeruk\n-\t 2 cm kunyit\n-\t 3 buah cabe merah\n-\t 15 buah cabe kecil", R.drawable.krawu))
        partList.add(
            dataresep("Lontong Kupang","\tBahan:" +
                "\n\t500 gr Kupang\n\t\tDaun Bawang (di iris)\n-\t Lontong\n-\t Lento Singkong\n-\t Tahu Goreng\n-\t Bawang Goreng\n-\t Bumbu Ulek\n-\t 1 sdm peting matang\n-\t 1/2 siung bawang putih\n-\t 1/2 sdm bawang putih goreng\n-\t cabe rawit secukupnya\n-\t 1 sdm air jeruk nipis\n-\t gula pasir\n-\t 1/2 sdt kaldu bubuk dan lada bubuk\n-\t 2 sdm minyak untuk tumisan\n-\t 1 liter air", R.drawable.lntgkpg)
        )

        return partList
    }
}
