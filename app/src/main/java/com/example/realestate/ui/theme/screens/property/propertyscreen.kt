package com.example.realestate.ui.theme.screens.property

import android.annotation.SuppressLint
import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold

import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.ui.theme.lightpink
import com.example.realestate.ui.theme.luminousgreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun propertyscreen(navController: NavController){


    Column(modifier = Modifier.fillMaxSize()) {


        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar(
                    containerColor = lightpink
                ) {
                    com.example.realestate.ui.theme.screens.property.bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(
                                        imageVector =
                                        if (index == selected)
                                            bottomNavItem.selectedIcon
                                        else
                                            bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title
                                    )
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            })
                    }
                }
            },
            topBar = {
                TopAppBar(
                    title = { Text(text = "Magic Bricks", fontFamily = FontFamily.Cursive) },
                    colors = TopAppBarDefaults.mediumTopAppBarColors(lightpink)
                )
            },


            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Add, contentDescription = "menu")
                    }
                }
            },
            //Content Section
            content = @Composable {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 80.dp, start = 20.dp),

                    ) {
                    val mContext = LocalContext.current


                    //start of row

                    Row {

                        //card
                        Card(
                            modifier = Modifier
                                .height(180.dp)
                                .width(200.dp)
                        ) {

                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {

                                Image(
                                    painter = painterResource(id = R.drawable.img_2),
                                    contentDescription = "home",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                                Icon(
                                    imageVector = Icons.Default.Home,
                                    contentDescription = "home"


                                )


                            }


                        }//end of card
                        Column (modifier = Modifier.padding(start = 20.dp)){
                            Text(text = "Visit Lavington")
                            Text(text = "The best property you can find")
                            Row {
                                Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "Star",
                                    tint = luminousgreen,
                                    modifier = Modifier.size(10.dp)
                                )
                                Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "Star",
                                    tint = luminousgreen,
                                    modifier = Modifier.size(10.dp)
                                )
                                Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "Star",
                                    tint = luminousgreen,
                                    modifier = Modifier.size(10.dp)
                                )
                                Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "Star",
                                    tint = luminousgreen,
                                    modifier = Modifier.size(10.dp)
                                )
                                Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "Star",
                                    tint = luminousgreen,
                                    modifier = Modifier.size(10.dp)
                                )
                            }


                            Text(text = "52,467 reviews")
                            Button(
                                onClick = {  val callIntent = Intent(Intent.ACTION_DIAL)
                                    callIntent.data = "tel:0720245837".toUri()
                                    mContext.startActivity(callIntent)},
                                colors = ButtonDefaults.buttonColors(lightpink),
                                shape = RoundedCornerShape(10.dp),

                                )


                            {
                                Text(text = "BUY")

                            }


                        }


                    }
                    //end of row

                    Spacer(modifier = Modifier.height(10.dp))


                    Button(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp, 20.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(lightpink),
                        shape = RoundedCornerShape(10.dp)


                    ) {
                        Text(text = "STK")

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Button(
                        onClick = {
                            val smsIntent = Intent(Intent.ACTION_SENDTO)
                            smsIntent.data = "smsto:0720245837".toUri()
                            smsIntent.putExtra("sms_body", "Hello Glory,how was your day?")
                            mContext.startActivity(smsIntent)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp, 20.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(lightpink),
                        shape = RoundedCornerShape(10.dp)


                    ) {
                        Text(text = "SMS")

                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Button(
                        onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp, 20.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(lightpink),
                        shape = RoundedCornerShape(10.dp)


                    ) {
                        Text(text = "CALL")

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Button(
                        onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp, 20.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(lightpink),
                        shape = RoundedCornerShape(10.dp)


                    ) {
                        Text(text = "E-Mail")

                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Button(
                        onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                            mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp, 20.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(lightpink),
                        shape = RoundedCornerShape(10.dp)


                    ) {
                        Text(text = "SHARE")

                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Button(
                        onClick = {
                            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                            if (cameraIntent.resolveActivity(mContext.packageManager) != null) {
                                mContext.startActivity(cameraIntent)
                            } else {
                                println("Camera app is not available")
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp, 20.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(lightpink),
                        shape = RoundedCornerShape(10.dp)


                    ) {
                        Text(text = "CAMERA")

                    }






                }
            }
        )

    }
}


val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route = "home",
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        hasNews = false,
        badges = 0
    ),


    BottomNavItem(
        title = "Detail",
        route = "detail",
        selectedIcon = Icons.Filled.Info,
        unselectedIcon = Icons.Outlined.Info,
        hasNews = true,
        badges = 5
    ),

    BottomNavItem(
        title = "Property",
        route = "property",
        selectedIcon = Icons.Filled.ShoppingCart,
        unselectedIcon = Icons.Outlined.ShoppingCart,
        hasNews = true,
        badges = 1
    ),


    )


data class BottomNavItem(
    val title: String,
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean,
    val badges: Int
)




@Composable
@Preview(showBackground = true)
fun propertyscreenPreview(){
    propertyscreen(rememberNavController())

}
