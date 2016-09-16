package com.stephenjfox.reactivecalculator

import android.content.Context
import trikita.anvil.RenderableView
import trikita.anvil.DSL.*

/**
 * Created by Stephen on 9/16/2016.
 */
class CalculatorScreen(c: Context) : RenderableView(c) {

  override fun view() {
    linearLayout {
      textView {
        text("Hello World")
      }
    }
  }
}