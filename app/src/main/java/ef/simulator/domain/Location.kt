package ef.simulator.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Location(
    val name: String,
    val image: String
) : Parcelable