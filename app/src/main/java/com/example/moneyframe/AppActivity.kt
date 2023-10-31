package com.example.moneyframe

import android.app.Activity
import android.os.Bundle
import com.example.moneyframe.databinding.ActivityAppBinding

class AppActivity : Activity() {

    private var _bindings: ActivityAppBinding? = null
    private val bindings: ActivityAppBinding
        get() = checkNotNull(_bindings) {
            "_bindings is null"
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        _bindings = ActivityAppBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindings.root)
    }
}