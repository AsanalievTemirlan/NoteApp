package com.example.noteapp.Ui.Fragments.OnBoard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import com.example.noteapp.R
import com.example.noteapp.databinding.FragmentOnBoardPagingBinding


class OnBoardPagingFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardPagingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardPagingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() = with(binding) {
        when (requireArguments().getInt(ARG_ONBOARD_POSITION)) {
            0 -> {
                lottie.setAnimation(R.raw.lottie_1)
                tvAdvantages.text = "Очень удобный функционал"
            }

            1 -> {
                tvAdvantages.text = "Быстрый, качественный продукт"
                lottie.setAnimation(R.raw.lottie_2)
                circleOne.setImageResource(R.drawable.circle_white)
                circleTwo.setImageResource(R.drawable.circle_orange)
            }

            2 -> {
                tvAdvantages.text = "Куча функций и интересных фишек"
                lottie.setAnimation(R.raw.lottie_3)
                circleThree.setImageResource(R.drawable.circle_orange)
                circleTwo.setImageResource(R.drawable.circle_white)
                circleOne.setImageResource(R.drawable.circle_white)
            }
        }
    }

    companion object {
        const val ARG_ONBOARD_POSITION = "onBoard"
    }
}