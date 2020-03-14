package mx.edu.itt.ladm_u2_practica2_danielmora

import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent

class Burbuja (){
    var x = 0f
    var y = 0f
    var tipo = 1 //1 circulo 2 rectangulo
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incX = 1
    var incY = 1

    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
        if(this.radio>=0 && this.radio>=75){
            incX*=4
            incY*=4
        }
        if(this.radio>=76 && this.radio>=140){
            incX*=2
            incY*=2
        }
        if(this.radio>=76 && this.radio>=140){
            incX*=-1
            incY*=-1
        }
    }



    fun pintar(c: Canvas, p: Paint){
        when(tipo){
            1->{
                c.drawCircle(x,y,radio,p)
            }
            2->{
                c.drawRect(x,y,x+ancho,y+alto,p)
            }
        }
    }



    fun rebote(ancho:Int, alto:Int){
        x+= incX
        if(x<=-100 || x>=ancho){
            incX *= -1
        }
        y+= incY
        if(y<=-100 || y>=alto){
            incY *= -1
        }

    }


}