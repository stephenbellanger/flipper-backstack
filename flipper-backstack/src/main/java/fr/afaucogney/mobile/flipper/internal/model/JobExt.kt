package fr.afaucogney.mobile.flipper.internal.model

import com.facebook.flipper.core.FlipperObject

internal fun FlipperObject.Builder.addJobsInfo(): FlipperObject.Builder {
    return this.put(JOBS, "N/A")
}
