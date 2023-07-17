package com.example.android.instagramui.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
fun ProfileSection(modifier: Modifier = Modifier) {
    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)) {
        RoundImage(
            painter = painterResource(id = R.drawable.profile_image),
            modifier = Modifier
                .size(100.dp)
                .weight(3f))
        Spacer(modifier = Modifier.width(16.dp))
        StatSection(modifier = Modifier.weight(7f))
    }

}

@Composable
fun RoundImage(
    painter: Painter,
    modifier: Modifier = Modifier
    ) {
        Image(
            painter = painter,
            contentDescription = "profile picture",
            modifier = modifier
                .aspectRatio(1f, matchHeightConstraintsFirst = true)
                .border(
                    width = 1.dp,
                    color = Color.LightGray,
                    shape = CircleShape
                )
                .padding(3.dp)
                .clip(CircleShape),
            contentScale = ContentScale.FillBounds)
    }


@Composable
fun StatSection(modifier: Modifier = Modifier) {
    Row(modifier = modifier,
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically) {
        ProfileStat(numberText = "601", text = "Posts")
        ProfileStat(numberText = "99.8k", text = "Followers")
        ProfileStat(numberText = "72", text = "Following")
    }
}

@Composable
fun ProfileStat(
    numberText: String,
    text: String,
    modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
    ) {
        Text(
            text = numberText,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp)
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = text,
            )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InstagramUITheme {
        ProfileScreen()
    }
}