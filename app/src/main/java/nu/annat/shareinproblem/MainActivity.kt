package nu.annat.shareinproblem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.shareIn

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		// this fails because of -> implementation 'com.android.billingclient:billing-ktx:3.0.1'
		flowOf(1,2,3,4,5).shareIn(MainScope(), SharingStarted.Eagerly)
	}
}
