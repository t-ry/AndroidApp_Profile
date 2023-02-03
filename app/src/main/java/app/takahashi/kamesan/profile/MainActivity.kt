package app.takahashi.kamesan.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import app.takahashi.kamesan.profile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply{ setContentView(this.root) }

        binding.showProfileButton.setOnClickListener{
            binding.profileImage.setImageResource( R.drawable.randy_image )
            binding.profileComentText.text = "名前"
            binding.profileComentText.text = "Androidメンターのランディだよ"
        }
        binding.showSportButton.setOnClickListener {
            binding.profileImage.setImageResource(R.drawable.baseball_image)
            binding.profileLabelText.text = "スポーツ"
            binding.profileComentText.text = "野球観戦が好きで、スタジアムに通っている"
        }
        binding.showFoodButton.setOnClickListener {
            binding.profileImage.setImageResource(R.drawable.donut_image)
            binding.profileLabelText.text = "好きな食べ物"
            binding.profileComentText.text = "キャンディやドーナツが大好き"
        }
        binding.showHobbyButton.setOnClickListener {
            binding.profileImage.setImageResource(R.drawable.gadget_image)
            binding.profileLabelText.text = "趣味"
            binding.profileComentText.text = "ガジェットを集めて動かすこと"
        }
    }
}