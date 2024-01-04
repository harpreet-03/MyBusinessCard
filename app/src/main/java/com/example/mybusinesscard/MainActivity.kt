package com.example.mybusinesscard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mybusinesscard.ui.theme.MyBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessImage("Harpreet Singh", "Android Developer Extraordinaire",
                        " +91 76962244XX", " harpreetDev", " harpreet16@gmail.com")
                }
            }
        }
    }
}



@Composable
fun BusinessImage(name: String, title: String,mob: String, social : String, idd: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.business)


    Column(  verticalArrangement = Arrangement.Center   ,horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.fillMaxSize()) {
        Column {
            Image(
                painter = image,
                contentDescription = null,
                modifier = modifier
                    .padding(1.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = name,
                fontSize = 40.sp,
                modifier = modifier
                    .padding(bottom = 1.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = title,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color(4, 90, 9, 255),
                modifier = modifier
                    .padding(4.dp)
                    .align(Alignment.CenterHorizontally)
            )
        }
    }

                newt(mob, social, idd)

}

@Composable
fun newt(mob: String, social : String, idd: String, modifier: Modifier = Modifier) {
    val icon1 = painterResource(R.drawable.phone)
    val icon2 = painterResource(R.drawable.linkedin1)
    val icon3 = painterResource(R.drawable.email1)

    Column(verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(30.dp)
            .fillMaxSize()
    ) {
        Row {
            Icon(
                painter = icon1,
                contentDescription = null,
                modifier = modifier.size(width = 22.dp, height = 26.dp).padding(4.dp)
            )
            Text(
                text = mob,

                )
        }
        Row {
            Icon(
                painter = icon2,
                contentDescription = null,
                modifier = modifier.size(width = 22.dp, height = 26.dp).padding(4.dp)
            )
            Text(
                text = social,

                )
        }
        Row {
            Icon(
                painter = icon3,
                contentDescription = null,
                modifier = modifier.size(width = 22.dp, height = 26.dp).padding(4.dp)
            )
            Text(
                text = idd,

                )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BusinessPreview() {
    MyBusinessCardTheme {
        BusinessImage("Harpreet Singh", "Android Developer Extraordinaire",
            " +91 76962244XX", " harpreetDev", " harpreet16@gmail.com")
    }
}