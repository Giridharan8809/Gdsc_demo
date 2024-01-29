package com.example.gdscdemo

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import java.lang.reflect.Modifier
import androidx.compose.ui.layout.ContentScale.Companion as ContentScale1

@Composable

fun GalleryScreen(){
    val imageListUrl = listOf(
        "https://i.imgur.com/OB0y6MR.jpg",
        "https://i.imgur.com/CzXTtJV.jpg",
        "https://farm4.staticflickr.com/3852/14447103450_2d0ff8802b_z_d.jpg",
        "https://farm2.staticflickr.com/1533/26541536141_41abe98db3_z_d.jpg",
        "https://farm4.staticflickr.com/3075/3168662394_7d7103de7d_z_d.jpg",
        "https://i.imgur.com/OnwEDW3.jpg",
        "https://farm3.staticflickr.com/2220/1572613671_7311098b76_z_d.jpg",
        "https://farm7.staticflickr.com/6089/6115759179_86316c08ff_z_d.jpg",
        "https://farm4.staticflickr.com/3224/3081748027_0ee3d59fea_z_d.jpg",
        "https://farm8.staticflickr.com/7377/9359257263_81b080a039_z_d.jpg",
        "https://farm9.staticflickr.com/8295/8007075227_dc958c1fe6_z_d.jpg",
        "https://farm2.staticflickr.com/1449/24800673529_64272a66ec_z_d.jpg"
    )
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(imageListUrl) { item ->
            AsyncImage(
                model = item,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = androidx.compose.ui.Modifier.height(240.dp)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(16.dp))

            )
        }
    }

}