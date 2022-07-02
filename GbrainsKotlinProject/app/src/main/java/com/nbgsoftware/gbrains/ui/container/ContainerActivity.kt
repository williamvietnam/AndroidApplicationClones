package com.nbgsoftware.gbrains.ui.container

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.fragment.NavHostFragment
import com.nbgsoftware.gbrains.R
import com.nbgsoftware.gbrains.base.MVVMActivity
import com.nbgsoftware.gbrains.databinding.ActivityContainerBinding

class ContainerActivity : MVVMActivity<ActivityContainerBinding>() {

    private lateinit var navController: NavController
    private lateinit var navGraph: NavGraph

    override fun getLayoutId(): Int = R.layout.activity_container

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.container) as NavHostFragment
        val graphInflater = navHostFragment.navController.navInflater
        navGraph = graphInflater.inflate(R.navigation.nav_graph)
        navController = navHostFragment.navController
        navGraph.setStartDestination(R.id.splashFragment)
        navController.graph = navGraph
    }
}