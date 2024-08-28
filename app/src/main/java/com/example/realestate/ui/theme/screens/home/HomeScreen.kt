package com.example.realestate.ui.theme.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ROUT_DETAIL
import com.example.realestate.ui.theme.lightpink


@Composable
fun HomeScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    )


    {
        Image(
            painter = painterResource(id = R.drawable.keja) ,
            contentDescription ="home",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        




        Text(text ="Magic Bricks",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta,


        )

        Text(text ="Your Better Choice",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta,
        )

        Button(onClick = { navController.navigate(ROUT_DETAIL) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp,20.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(lightpink),
            shape = RoundedCornerShape(10.dp)


        ) {
            Text(text = "Get Started")

        }
    }


}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}

