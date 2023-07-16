package com.example.android.instagramui.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.instagramui.R
import com.example.android.instagramui.ui.theme.InstagramUITheme



@Composable
fun ProfileScreen() {
        Column {
            TopBar(name = "Nwachukwu Chigozie")
            Spacer(modifier = Modifier.height(4.dp))
            ProfileSection()
        }
    }


@Composable
fun ProfileSection(modifier: Modifier = Modifier) {
    Row(modifier = modifier
        .fillMaxWidth()
        .padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        ProfilePicture(painter = painterResource(id = R.drawable.profile_picture))
        StatSection()
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    name: String,
    modifier: Modifier = Modifier
) {
    CenterAlignedTopAppBar(title = {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = modifier.fillMaxWidth()
        ) {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back",
                tint = Color.Black,
                modifier = Modifier.size(24.dp))
            Text(text = name,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Icon(painter = painterResource(id = R.drawable.ic_bell),
                contentDescription = "Bell",
                tint = Color.Black,
                modifier = Modifier.size(24.dp))

            Icon(painter = painterResource(id = R.drawable.ic_dotmenu),
                contentDescription = "Back",
                tint = Color.Black,
                modifier = Modifier.size(24.dp))

        }
    })




}

@Composable
fun ProfilePicture(modifier: Modifier = Modifier,painter: Painter) {
    Box(modifier = modifier.size(40.dp)) {
        Image(
            painter = painter,
            contentDescription = "profile picture",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .clip(CircleShape)
                .size(40.dp)
                .border(
                    width = 1.dp,
                    color = Color.LightGray,
                    shape = CircleShape
                ))
    }

}

@Composable
fun StatSection(modifier: Modifier = Modifier) {
    Row(modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        Stat(number = "601", statName = "Posts")
        Stat(number = "99.8k", statName = "Followers")
        Stat(number = "72", statName = "Following")
    }
}

@Composable
fun Stat(number: String, statName: String) {
    Column() {
        Text(text = number)
        Text(text = statName)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InstagramUITheme {
        ProfileScreen()
    }
}