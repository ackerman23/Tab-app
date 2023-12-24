package adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import fragments.GamesFragment
import fragments.MagazineFragment
import fragments.MoviesFragment

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return GamesFragment()
            1 -> return MagazineFragment()
        }
        return MoviesFragment()
    }

}