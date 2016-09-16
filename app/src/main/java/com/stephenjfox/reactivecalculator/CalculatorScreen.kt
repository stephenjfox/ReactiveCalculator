package com.stephenjfox.reactivecalculator

import android.content.Context
import android.widget.LinearLayout
import trikita.anvil.BaseDSL
import trikita.anvil.RenderableView
import trikita.anvil.DSL.*

/**
 * The full screen of the Calculator
 *
 * Created by Stephen on 9/16/2016.
 */
class CalculatorScreen(c: Context) : RenderableView(c) {

  override fun view() {
    linearLayout {

      orientation(LinearLayout.VERTICAL)
      size(FILL, FILL)
      weightSum(5f)

      // number emission field
      textView {
        id(R.id.calculator_text_view)
        weight(2f)
        size(MATCH, 0)

        text("This is where numbers should go")
        textSize(sip(50f))
        padding(dip(20))
      }

      // button grid
      gridLayout {
        size(FILL, 0)
        weight(3f)
        columnCount(3)

        Companion.buttonRow(7..9)
        Companion.buttonRow(4..6)
        Companion.buttonRow(1..3)
      }
    }
  }

  companion object {
    private fun buttonRow(range: IntRange) {
      for (i in range) {
        button {
          text("$i")
          textSize(sip(20f))
          size(dip(100), dip(100))
        }
      }
    }
  }
}