package com.example.myapp

import android.annotation.SuppressLint
import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
              // LoginScreen()
            HomeScreen()
                // A surface container using the 'background' color from the theme
//                Scaffold(
//                    topBar = {
//                        TopAppBar(
//                            title ={
//                                Text(text = "Welcome to the study mate")
//                                   },
//
//                        )
//                    },
//                    content = {
//                        Column(
//                            modifier = Modifier
//                                .fillMaxSize()
//                                .padding(16.dp),
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            verticalArrangement = Arrangement.Center
//                        ) {
//                            Text(
//                                text = "My first interface design in jetpack compose",
//                                style = MaterialTheme.typography.bodyMedium,
//                                modifier = Modifier.padding(bottom = 16.dp)
//                            )
//                            Image(
//                                painter = painterResource(id = R.drawable.ic_launcher_background),
//                                contentDescription = "THIS THR STUDY MATE",
//                                modifier = Modifier
//                                    .padding(bottom = 16.dp)
//                                    .size(200.dp)
//                            )
//                            Button(
//                                onClick = { /*TODO*/ },
//                                modifier = Modifier
//                                    .fillMaxWidth()
//                                    .padding(bottom = 16.dp)
//                            ) {
//                                Text(text = "Start your journey")
//                            }
//
//                        }
//
//                    }
//                )
            }
        }
    }
}

//@Composable
//fun HomeScreen() {
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text(text = "Welcome to Study Mate!") },
//                backgroundColor = Color.Blue
//            )
//        },
//        content = {
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(16.dp),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center
//            ) {
//                Text(
//                    text = "Congratulations on logging in!",
//                    style = MaterialTheme.typography.h4,
//                    modifier = Modifier.padding(bottom = 16.dp)
//                )
//                Image(
//                    painter = painterResource(R.drawable.study_mate_logo),
//                    contentDescription = "Study Mate Logo",
//                    modifier = Modifier
//                        .size(200.dp)
//                        .padding(bottom = 16.dp)
//                )
//                Button(
//                    onClick = { /* Perform action on button click */ },
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(bottom = 16.dp)
//                ) {
//                    Text("Start Studying!")
//                }
//            }
//        }
//    )
//}

//
//@Composable
//fun UserLoginPage() {
//    var name by remember { mutableStateOf("") }
//    var email by remember { mutableStateOf("") }
//    var password by remember { mutableStateOf("") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(horizontal = 16.dp)
//    ) {
//        OutlinedTextField(
//            value = name,
//            onValueChange = { name = it },
//            label = { Text("Name") },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(vertical = 8.dp)
//        )
//
//        OutlinedTextField(
//            value = email,
//            onValueChange = { email = it },
//            label = { Text("Email ID") },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(vertical = 8.dp)
//        )
//
//        OutlinedTextField(
//            value = password,
//            onValueChange = { password = it },
//            label = { Text("Password") },
//            visualTransformation = PasswordVisualTransformation(),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(vertical = 8.dp)
//        )
//
//        Button(
//            onClick = { /* Perform login action */ },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(vertical = 16.dp)
//        ) {
//            Text("Login")
//        }
//    }
//}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    // user input for login
    var name by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    //column to carry the input fields
    Column() {
        OutlinedTextField(
            value = "",
            onValueChange = {name = it},
            label = {
                Text(text = ("Name"))
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )
        OutlinedTextField(
            value = "",
            onValueChange = {email = it},
            label = {
                Text(text = ("Email"))
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )
        OutlinedTextField(
            value = "",
            onValueChange = {password = it},
            label = {
                Text(text = ("Password"))
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        ) {
            Text(
                text = "Login"
            )

        }

    }

}


//@Composable
//fun StudyDetailsScreen() {
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text(text = "Study Details") },
//                backgroundColor = Color.Blue,
//                navigationIcon = {
//                    IconButton(
//                        onClick = { /* Perform action on navigation icon click */ }
//                    ) {
//                        Icon(
//                            imageVector = Icons.Default.ArrowBack,
//                            contentDescription = "Back"
//                        )
//                    }
//                }
//            )
//        },
//        content = {
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(16.dp),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Top
//            ) {
//                Text(
//                    text = "Unit 1",
//                    style = MaterialTheme.typography.h5,
//                    modifier = Modifier.padding(bottom = 8.dp)
//                )
//                Text(
//                    text = "Introduction to Mathematics",
//                    style = MaterialTheme.typography.subtitle1,
//                    modifier = Modifier.padding(bottom = 16.dp)
//                )
//                Text(
//                    text = "In this unit, you will learn about the basics of mathematics, including addition, subtraction, multiplication, and division. We will also cover fractions, decimals, and percentages.",
//                    style = MaterialTheme.typography.body1,
//                    modifier = Modifier.padding(bottom = 16.dp)
//                )
//                Text(
//                    text = "Topics:",
//                    style = MaterialTheme.typography.subtitle1,
//                    modifier = Modifier.padding(bottom = 8.dp)
//                )
//                Text(
//                    text = "- Addition and Subtraction\n- Multiplication and Division\n- Fractions, Decimals, and Percentages",
//                    style = MaterialTheme.typography.body1,
//                    modifier = Modifier.padding(bottom = 16.dp)
//                )
//                Text(
//                    text = "Duration: 2 weeks",
//                    style = MaterialTheme.typography.subtitle1,
//                    modifier = Modifier.padding(bottom = 16.dp)
//                )
//                Button(
//                    onClick = { /* Perform action on button click */ },
//                    modifier = Modifier.fillMaxWidth()
//                ) {
//                    Text("Start Studying!")
//                }
//            }
//        }
//    )
//}


//create the home screen
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen() {
    //define the scaffold
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Study Mate Home Screen")
                },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ })
                    {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )


    },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Text(
                    text = "Computer Science",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(bottom = 16.dp)

                )
                Text(
                    text = "Computer Science",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(bottom = 16.dp)

                )
                Text(
                    text = "Computer Science",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(bottom = 16.dp)

                )
                Text(
                    text = "Computer Science",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(bottom = 16.dp)

                )
                Text(
                    text = "Computer Science",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(bottom = 16.dp)

                )
                Text(
                    text = "Computer Science",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(bottom = 16.dp)

                )
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                   Text(text = "Start Learning")
                }



            }

        }
    )



}