package mx.edu.itt.ladm_u2_practica2_danielmora

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View
import kotlin.random.Random

class Lienzo(p:MainActivity) : View(p) {
    // se requiere p para que view sepa cual activity va a trabajar
    var puntero = p
    /*var cx = 150f
    var cy = 150f
    var tx = 733f
    var ty = 818f*/
    var circulo = Burbuja(150, 150, 120)
    var b1=Burbuja(Random.nextInt(0,1000),Random.nextInt(0,2000),Random.nextInt(50,200))
    var b2=Burbuja(Random.nextInt(0,1000),Random.nextInt(0,2000),Random.nextInt(50,200))
    var b3=Burbuja(Random.nextInt(0,1000),Random.nextInt(0,2000),Random.nextInt(50,200))
    var b4=Burbuja(Random.nextInt(0,1000),Random.nextInt(0,2000),Random.nextInt(50,200))
    var b5=Burbuja(Random.nextInt(0,1000),Random.nextInt(0,2000),Random.nextInt(50,200))
    var b6=Burbuja(Random.nextInt(0,1000),Random.nextInt(0,2000),Random.nextInt(50,200))
    var b7=Burbuja(Random.nextInt(0,1000),Random.nextInt(0,2000),Random.nextInt(50,200))
    var b8=Burbuja(Random.nextInt(0,1000),Random.nextInt(0,2000),Random.nextInt(50,200))
    var b9=Burbuja(Random.nextInt(0,1000),Random.nextInt(0,2000),Random.nextInt(50,200))
    var b10=Burbuja(Random.nextInt(0,1000),Random.nextInt(0,2000),Random.nextInt(50,200))



    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.BLACK)


        paint.color = Color.RED
        b1.pintar(canvas, paint)
        paint.color = Color.GRAY
        b2.pintar(canvas, paint)
        paint.color = Color.GREEN
        b3.pintar(canvas, paint)
        paint.color = Color.WHITE
        b4.pintar(canvas, paint)
        paint.color = Color.CYAN
        b5.pintar(canvas, paint)
        paint.color = Color.LTGRAY
        b6.pintar(canvas, paint)
        paint.color = Color.MAGENTA
        b7.pintar(canvas, paint)
        paint.color = Color.YELLOW
        b8.pintar(canvas, paint)
        paint.color = Color.rgb(233,23,212)
        b9.pintar(canvas, paint)
        paint.color = Color.rgb(23,234,4)
        b10.pintar(canvas, paint)





    }


    fun animarCirculo() {
        circulo.rebote(width, height)
        b1.rebote(width, height)
        b2.rebote(width, height)
        b3.rebote(width, height)
        b4.rebote(width, height)
        b5.rebote(width, height)
        b6.rebote(width, height)
        b7.rebote(width, height)
        b8.rebote(width, height)
        b9.rebote(width, height)
        b10.rebote(width, height)
        invalidate()
    }

}
