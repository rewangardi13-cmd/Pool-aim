package com.poolaim

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class AimView(context: Context) : View(context) {
    private val paint = Paint().apply {
        color = Color.RED
        strokeWidth = 5f
        isAntialias = true
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val cx = width / 2f
        val cy = height / 2f
        canvas.drawLine(cx - 50f, cy, cx + 50f, cy, paint)
        canvas.drawLine(cx, cy - 50f, cx, cy + 50f, paint)
    }
}
