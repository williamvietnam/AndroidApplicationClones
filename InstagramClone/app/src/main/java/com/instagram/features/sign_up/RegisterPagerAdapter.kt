package com.instagram.features.sign_up

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class RegisterPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    private companion object {
        const val ITEM_COUNTS = 2
    }

    override fun getItemCount(): Int {
        return ITEM_COUNTS
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> RegisterByPhoneFragment()
            1 -> RegisterByEmailFragment()
            else -> {
                RegisterByPhoneFragment()
            }
        }
    }
}