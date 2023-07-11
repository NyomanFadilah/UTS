package com.nyoman.uts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Build(
    val imgBuild: Int,
    val nameBuild: String,
    val DescriptionBuild: String
) : Parcelable