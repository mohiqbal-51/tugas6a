package com.iqbal.praktikum6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_resep_detail.*
import kotlinx.android.synthetic.main.contact_list_item.*

class resepdetailactivity : AppCompatActivity () {

    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resep_detail)

        var intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var nama= intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var isiresep = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SPLIT_NAME)
            var fotoresep = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_REFERRER).toInt()
            tv_nama1.text = nama
            tv_isiresep.text = isiresep
            tv_foto1.setImageResource(fotoresep)

        }
    }

}