package com.trivisiontech.flywithmysystemdesign.icons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Help
import androidx.compose.material.icons.automirrored.filled.Logout
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.HelpOutline
import androidx.compose.material.icons.automirrored.outlined.Logout
import androidx.compose.material.icons.filled.Camera
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.CameraAlt
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.rounded.CameraAlt
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.sharp.Favorite
import androidx.compose.material.icons.sharp.Home
import androidx.compose.material.icons.sharp.Person
import androidx.compose.material.icons.sharp.Settings
import androidx.compose.material.icons.twotone.Favorite
import androidx.compose.material.icons.twotone.Home
import androidx.compose.material.icons.twotone.Person
import androidx.compose.material.icons.twotone.Settings
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

object AppIcons {
    val Home: ImageVector get() = Icons.Filled.Home
    val Settings: ImageVector get() = Icons.Filled.Settings
    val Person: ImageVector get() = Icons.Filled.Person
    val Info: ImageVector get() = Icons.Filled.Info
    val Phone: ImageVector get() = Icons.Filled.Phone
    val Email: ImageVector get() = Icons.Filled.Email
    val Help: ImageVector get() = Icons.AutoMirrored.Filled.Help
    val Logout: ImageVector get() = Icons.AutoMirrored.Filled.Logout
    val Favorite: ImageVector get() = Icons.Filled.Favorite
    val Search: ImageVector get() = Icons.Filled.Search
    val ArrowBack: ImageVector get() = Icons.AutoMirrored.Filled.ArrowBack
    val Camera: ImageVector get() = Icons.Filled.Camera
    val ShoppingCart: ImageVector get() = Icons.Filled.ShoppingCart

    // Outlined Icons
    val HomeOutline: ImageVector get() = Icons.Outlined.Home
    val SettingsOutline: ImageVector get() = Icons.Outlined.Settings
    val PersonOutline: ImageVector get() = Icons.Outlined.Person
    val InfoOutline: ImageVector get() = Icons.Outlined.Info
    val PhoneOutline: ImageVector get() = Icons.Outlined.Phone
    val EmailOutline: ImageVector get() = Icons.Outlined.Email
    val HelpOutline: ImageVector get() = Icons.AutoMirrored.Outlined.HelpOutline
    val LogoutOutline: ImageVector get() = Icons.AutoMirrored.Outlined.Logout
    val FavoriteOutline: ImageVector get() = Icons.Outlined.FavoriteBorder
    val SearchOutline: ImageVector get() = Icons.Outlined.Search
    val ArrowBackOutline: ImageVector get() = Icons.AutoMirrored.Outlined.ArrowBack
    val CameraOutline: ImageVector get() = Icons.Outlined.CameraAlt
    val ShoppingCartOutline: ImageVector get() = Icons.Outlined.ShoppingCart

    // Rounded Icons
    val HomeRounded: ImageVector get() = Icons.Rounded.Home
    val SettingsRounded: ImageVector get() = Icons.Rounded.Settings
    val PersonRounded: ImageVector get() = Icons.Rounded.Person
    val FavoriteRounded: ImageVector get() = Icons.Rounded.Favorite
    val CameraRounded: ImageVector get() = Icons.Rounded.CameraAlt
    val ShoppingCartRounded: ImageVector get() = Icons.Rounded.ShoppingCart

    // Sharp Icons
    val HomeSharp: ImageVector get() = Icons.Sharp.Home
    val SettingsSharp: ImageVector get() = Icons.Sharp.Settings
    val PersonSharp: ImageVector get() = Icons.Sharp.Person
    val FavoriteSharp: ImageVector get() = Icons.Sharp.Favorite

    // TwoTone Icons
    val HomeTwoTone: ImageVector get() = Icons.TwoTone.Home
    val SettingsTwoTone: ImageVector get() = Icons.TwoTone.Settings
    val PersonTwoTone: ImageVector get() = Icons.TwoTone.Person
    val FavoriteTwoTone: ImageVector get() = Icons.TwoTone.Favorite
}

@Preview
@Composable
fun PreviewAllIcons() {
    Column(Modifier.padding(16.dp)) {
        Icon(AppIcons.Home, contentDescription = "Home")
        Icon(AppIcons.SettingsOutline, contentDescription = "Settings Outline")
        Icon(AppIcons.PersonRounded, contentDescription = "Person Rounded")
    }
}
