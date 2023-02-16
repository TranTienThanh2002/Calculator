package hcmute.edu.vn.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num0 = findViewById(R.id.num0) as Button;
        val num1 = findViewById(R.id.num1) as Button;
        val num2 = findViewById(R.id.num2) as Button;
        val num3 = findViewById(R.id.num3) as Button;
        val num4 = findViewById(R.id.num4) as Button;
        val num5 = findViewById(R.id.num5) as Button;
        val num6 = findViewById(R.id.num6) as Button;
        val num7 = findViewById(R.id.num7) as Button;
        val num8 = findViewById(R.id.num8) as Button;
        val num9 = findViewById(R.id.num9) as Button;
        val numDoc = findViewById(R.id.numDoc) as Button;
        val numAdd = findViewById(R.id.numAdd) as Button;
        val numMinus = findViewById(R.id.numMinus) as Button;
        val numMul = findViewById(R.id.numMul) as Button;
        val numDiv = findViewById(R.id.numDiv) as Button;
        val numDel = findViewById(R.id.numDel) as Button;
        val numReset = findViewById(R.id.numReset) as Button;
        val numEqual = findViewById(R.id.numEqual) as Button;
        val text = findViewById(R.id.textView) as TextView;
        val textMath = findViewById(R.id.textMath) as TextView;
        var val1 = "";
        var val2 = "";
        var math = "";

        var check = "false";

        //number btn
        fun getValue(x :String){
            if(check === "false"){
                val1 = if(val1.isEmpty()){
                    x;
                } else{
                    val1.plus(x);
                }
//                equal.plus(val1);
                text.setText(val1);
            }else{
                val2 = if(val2.isEmpty()){
                    x;
                } else{
                    val2.plus(x);
                }
                text.setText(val2);
            }

        }
        num0.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                if(val1!==""){
                    getValue("0")
                }



            }
        }


        )
        num1.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                getValue("1")
            }
        }


        )
        num2.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                getValue("2")
            }
        }


        )
        num3.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                getValue("3")
            }
        }


        )
        num4.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                getValue("4")
            }
        }


        )
        num5.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                getValue("5")
            }
        }


        )
        num6.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                getValue("6")
            }
        }


        )
        num7.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                getValue("7")
            }
        }


        )
        num8.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                getValue("8")
            }
        }


        )
        num9.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                getValue("9")
            }
        }


        )
        numDoc.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                getValue(".")
            }
        }


        )
        //calculator
        numAdd.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                math = "+";
                check = "true";
                textMath.setText(math);
            }
        }
        )
        numDiv.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                math = "/";
                check = "true";
                textMath.setText(math);
            }
        }
        )
        numMul.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                math = "x";
                check = "true";
                textMath.setText(math);
            }
        }
        )
        numMinus.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                math = "-";
                check = "true";
                textMath.setText(math);
            }
        }
        )
        numReset.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                val1="";
                val2 = ""
                math="";
                check="false";
                textMath.setText(math);
                text.setText("");
            }
        }
        )
        numDel.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                if(check === "false"){
                    val1.removeRange(val1.length-1, val1.length);
                    text.setText(val1);
                }
                else{
                    val2.removeRange(val1.length-1, val1.length);
                    text.setText(val2);
                }


            }
        }
        )
        numEqual.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                val numberA:Double;
                val numberB:Double;
                val equalMath: Double;
                if(val1 !=="" && val2 !==""){
                    if(math === "+"){

                        numberA = val1.toDouble();

                        numberB = val2.toDouble();
                        equalMath = numberA + numberB;

                        text.setText(equalMath.toString());
                    }
                    else if(math === "-"){
                        numberA = val1.toDouble();
                        numberB = val2.toDouble();
                        equalMath = numberA - numberB;

                        text.setText(equalMath.toString());
                    }
                    else if(math === "x"){
                        numberA = val1.toDouble();

                        numberB = val2.toDouble();
                        equalMath = numberA * numberB;

                        text.setText(equalMath.toString());
                    }
                    else if(math === "/"){
                        numberA = val1.toDouble();

                        numberB = val2.toDouble();
                        equalMath = numberA / numberB;

                        text.setText(equalMath.toString());
                    }
                    val1="";
                    val2 = ""
                    math="";
                    check="false";
                    textMath.setText(math);
                }



            }
        }
        )


    }
}