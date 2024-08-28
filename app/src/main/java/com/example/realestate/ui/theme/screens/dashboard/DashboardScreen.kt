package com.example.realestate.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ADD_PRODUCTS_URL
import com.example.realestate.navigation.ROUT_HOME
import com.example.realestate.navigation.VIEW_PRODUCTS_URL
import com.example.realestate.ui.theme.luminousgreen

@Composable
fun DashboardScreen(navController: NavController){

    Column(modifier =  Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.icon) ,
            contentDescription ="icon",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "Manage your properties with ease!",
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold


        )

        Spacer(modifier = Modifier.height(15.dp))

        Column (modifier = Modifier.verticalScroll(rememberScrollState())) {


            Card (modifier = Modifier
                .fillMaxWidth()
                .height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(luminousgreen)
            )

            {  //Row1
                Row (modifier = Modifier.padding(20.dp)){

                    //card1
                    Card (modifier = Modifier
                        .clickable { navController.navigate(ROUT_HOME) }
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp)){

                        Column {
                            Box(modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center) {
                                Image(painter = painterResource(id = R.drawable.icon),
                                    contentDescription ="", modifier = Modifier.size(100.dp))

                            }
                            Spacer(modifier = Modifier.height(5.dp))

                            Text(text = "HOME",
                                fontSize = 20.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center)

                        }

                    }//end of card1
                    Spacer(modifier = Modifier.width(20.dp))

                    //card2
                    Card (modifier = Modifier
                        .clickable { navController.navigate(ROUT_HOME) }
                        .width(160.dp)
                        .height(180.dp)){

                        Column {
                            Box(modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center) {
                                Image(painter = painterResource(id = R.drawable.setting),
                                    contentDescription ="", modifier = Modifier.size(100.dp))

                            }
                            Spacer(modifier = Modifier.height(5.dp))

                            Text(text = "SETTINGS",
                                fontSize = 20.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center)

                        }

                    }//end of card2




                }//End of Row1
                 //Row2
                    Row (modifier = Modifier.padding(20.dp)){

                        //card3
                        Card (modifier = Modifier
                            .clickable { navController.navigate(ROUT_HOME) }
                            .width(160.dp)
                            .height(180.dp)){

                            Column {
                                Box(modifier = Modifier.fillMaxWidth(),
                                    contentAlignment = Alignment.Center) {
                                    Image(painter = painterResource(id = R.drawable.location),
                                        contentDescription ="", modifier = Modifier.size(100.dp))

                                }
                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "LOCATION",
                                    fontSize = 20.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center)

                            }

                        }//end of card3
                        Spacer(modifier = Modifier.width(20.dp))

                        //card4
                        Card (modifier = Modifier
                            .clickable { navController.navigate(ROUT_HOME) }
                            .width(160.dp)
                            .height(180.dp)){

                            Column {
                                Box(modifier = Modifier.fillMaxWidth(),
                                    contentAlignment = Alignment.Center) {
                                    Image(painter = painterResource(id = R.drawable.property),
                                        contentDescription ="", modifier = Modifier.size(100.dp))

                                }
                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "PROPERTY",
                                    fontSize = 20.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center)

                            }

                        }//end of card4




                    }//End of Row2
                      //Row3
                        Row (modifier = Modifier.padding(20.dp)){

                            //card5
                            Card (modifier = Modifier
                                .clickable { navController.navigate(ADD_PRODUCTS_URL) }
                                .width(160.dp)
                                .height(180.dp)){

                                Column {
                                    Box(modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center) {
                                        Image(painter = painterResource(id = R.drawable.icon),
                                            contentDescription ="", modifier = Modifier.size(100.dp))

                                    }
                                    Spacer(modifier = Modifier.height(5.dp))

                                    Text(text = "HOME",
                                        fontSize = 20.sp,
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center)

                                }

                            }//end of card5
                            Spacer(modifier = Modifier.width(20.dp))

                            //card6
                            Card (modifier = Modifier
                                .clickable { navController.navigate(VIEW_PRODUCTS_URL) }
                                .width(160.dp)
                                .height(180.dp)){

                                Column {
                                    Box(modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center) {
                                        Image(painter = painterResource(id = R.drawable.icon),
                                            contentDescription ="", modifier = Modifier.size(100.dp))

                                    }
                                    Spacer(modifier = Modifier.height(5.dp))

                                    Text(text = "HOME",
                                        fontSize = 20.sp,
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center)

                                }

                            }//end of card6




                        }//End of Row3




                    }

        }








    }

}




@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())

}
