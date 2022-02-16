package com.example.twitter_application_inkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.twitter_application_inkotlin.adapter.FeedAdapter
import com.example.twitter_application_inkotlin.adapter.StoryAdapter
import com.example.twitter_application_inkotlin.model.Post
import com.example.twitter_application_inkotlin.model.Story

class MainActivity : AppCompatActivity() {

    lateinit var recyclerStory: RecyclerView
    lateinit var recyclerFeed: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerStory = findViewById(R.id.recyclerStory)
        recyclerFeed = findViewById(R.id.recyclerFeed)
        recyclerStory.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerFeed.layoutManager = GridLayoutManager(this,1)

        refreshPostAdapter(getAllPost())
        refreshStoryAdapter(getAllStory())
    }

    private fun getAllPost(): ArrayList<Post> {
        val feed : ArrayList<Post> = ArrayList()
        feed.add(Post(R.drawable.img1,"Ilhombek Ubaydullayev",R.drawable.img17))
        feed.add(Post(R.drawable.img11,"Ilhombek Ubaydullayev",R.drawable.img10))
        feed.add(Post(R.drawable.img12,"Ilhombek Ubaydullayev",R.drawable.img18))
        feed.add(Post(R.drawable.img13,"Ilhombek Ubaydullayev",R.drawable.img21))
        feed.add(Post(R.drawable.img14,"Ilhombek Ubaydullayev",R.drawable.img22))
        feed.add(Post(R.drawable.img15,"Ilhombek Ubaydullayev",R.drawable.img23))
        feed.add(Post(R.drawable.img16,"Ilhombek Ubaydullayev",R.drawable.img24))
        feed.add(Post(R.drawable.img17,"Ilhombek Ubaydullayev",R.drawable.img25))
        feed.add(Post(R.drawable.img12,"Ilhombek Ubaydullayev",R.drawable.img28))
        return feed
    }

    private fun getAllStory(): ArrayList<Story> {
        val chats : ArrayList<Story> = ArrayList()
        chats.add(Story(R.drawable.imag,"Ilhombek"))
        chats.add(Story(R.drawable.img11,"Abdumajid"))
        chats.add(Story(R.drawable.img23,"Bek"))
        chats.add(Story(R.drawable.img16,"Bek"))
        chats.add(Story(R.drawable.img17,"Bek"))
        chats.add(Story(R.drawable.img18,"Bek"))
        chats.add(Story(R.drawable.img19,"Bek"))
        chats.add(Story(R.drawable.img20,"Bek"))
        chats.add(Story(R.drawable.img21,"Bek"))
        chats.add(Story(R.drawable.img10,"Bek"))
        chats.add(Story(R.drawable.img19,"Bek"))

        return chats
    }

    private fun refreshPostAdapter(feed: ArrayList<Post>) {
        val adapter = FeedAdapter(this,feed)
        recyclerFeed.adapter = adapter
    }

    private fun refreshStoryAdapter(chats: ArrayList<Story>) {
        val adapter = StoryAdapter(this,chats)
        recyclerStory.adapter = adapter
    }
}