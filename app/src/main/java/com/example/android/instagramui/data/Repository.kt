package com.example.android.instagramui.data

import androidx.compose.ui.res.painterResource
import com.example.android.instagramui.R


object Repository {
    val imageWithTextList = listOf(
        ImageWithText(
            image = R.drawable.youtube,
            "YouTube"
        ),
        ImageWithText(
            image = R.drawable.qa,
            "Q&A"
        ),
        ImageWithText(
            image = R.drawable.discord,
            "Discord"
        ),
        ImageWithText(
            image = R.drawable.telegram,
            "Telegram"
        )
    )

    val postTabImages = listOf(
        ImageWithText(
            image = R.drawable.ic_grid,
            "Posts"
        ),
        ImageWithText(
            image = R.drawable.ic_reels,
            "Reels"
        ),
        ImageWithText(
            image = R.drawable.ic_igtv,
            "IGTV"
        ),
        ImageWithText(
            image = R.drawable.profile,
            "Profile"
        )
    )

    val postSectionImages = listOf(
        R.drawable.kmm,
        R.drawable.intermediate_dev,
        R.drawable.master_logical_thinking,
        R.drawable.bad_habits,
        R.drawable.multiple_languages,
        R.drawable.learn_coding_fast,

    )
}