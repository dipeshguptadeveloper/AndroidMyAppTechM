package com.dkgtech.myapptechm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dkgtech.myapptechm.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityForgotPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnForgotPasswordSubmit.setOnClickListener {
            startActivity(Intent(this@ForgotPasswordActivity, ResetPasswordActivity::class.java))
        }
    }
}