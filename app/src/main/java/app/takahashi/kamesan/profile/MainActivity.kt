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
            binding.profileComentText.text = "かめさんって呼ばれてるよ\nKotlinとJSをぼちぼちと触ってる\nHAREの服とファミマがすき"
        }
        binding.showSportButton.setOnClickListener {
            binding.profileImage.setImageResource(R.drawable.baseball_image)
            binding.profileLabelText.text = "スポーツ"
            binding.profileComentText.text = "実は空手を11年やってました"
        }
        binding.showFoodButton.setOnClickListener {
            binding.profileImage.setImageResource(R.drawable.donut_image)
            binding.profileLabelText.text = "好きな食べ物"
            binding.profileComentText.text = "おすしとすいーつ、チョコレートはビターがすき"
        }
        binding.showHobbyButton.setOnClickListener {
            binding.profileImage.setImageResource(R.drawable.gadget_image)
            binding.profileLabelText.text = "趣味"
            binding.profileComentText.text = "広く浅く、何でもやります。\n最近はValorantと料理にはまってるよ"
        }
    }
}