package com.example.luckydice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.semantics.SemanticsActions.OnClick
//import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.luckydice.ui.theme.LuckyDIceTheme
import java.lang.Math.random

//import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LuckyDIceTheme {

//                var showdialog=true
                Base()

                // A surface container using the 'background' color from the theme

            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Base(){
    var num by remember {
        mutableStateOf("")
    }
    Column(modifier= androidx.compose.ui.Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        var x by remember{
            mutableStateOf(0)
        }
        var res by remember {
            mutableStateOf("")
        }

        TextField(value = num, onValueChange ={num=it} )

        Button(onClick = {
                        x=(1..6).random()
                         if(num.toInt() == x){
                             res="Lucky fat ass"
                         }
                        else{
                            res= "BITCH"
                         }


        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White,

                ),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(text = "Just Do it!!!")

        }
        if(x!=0){
            Text(text = x.toString())

        }

        Text(text = res.toString())







    }


}
//@Composable
//fun CreateButton(
//    OnClick: () -> Unit
//){
//
//}
//@Composable
//fun Roll(
//){
//    var x= (1..6).random()
//    if(x == no){
//         Text(text = )
//
//    }
//    else{
//        Text(text = "You are a Bitch ")
//    }
//
//
//
//
//}


