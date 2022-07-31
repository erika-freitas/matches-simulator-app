package ef.simulator.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Match(
    val description: String,
    val location: Location,
    val homeTeam: Team,
    val awayTeam: Team
) : Parcelable