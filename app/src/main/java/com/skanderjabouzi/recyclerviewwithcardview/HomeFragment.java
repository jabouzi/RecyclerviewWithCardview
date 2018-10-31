package com.skanderjabouzi.recyclerviewwithcardview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements MyAdapter.ItemClickListener{

    MyAdapter adapter;
    RecyclerView rv;
    LinearLayoutManager llm;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_home, null);
        rv = view.findViewById(R.id.rv);
        llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);
//        rv.getLayoutManager().setMeasurementCacheEnabled(false);


        ArrayList<Book> books = new ArrayList<>();
        Book mBook = new Book();
        mBook.setBookName("Android Developer Guide");
        mBook.setAuthor("Leon");
        mBook.setImage(R.mipmap.java);
        mBook.setPublishTime(2014);
        books.add(mBook);

        mBook = new Book();
        mBook.setBookName("C++ Developer Guide");
        mBook.setAuthor("John");
        mBook.setImage(R.mipmap.cplus);
        mBook.setPublishTime(2015);
        books.add(mBook);

        mBook = new Book();
        mBook.setBookName("Java Developer Guide");
        mBook.setAuthor("Marc");
        mBook.setImage(R.mipmap.java);
        mBook.setPublishTime(2013);
        books.add(mBook);

        mBook = new Book();
        mBook.setBookName("C# Developer Guide");
        mBook.setAuthor("Steve");
        mBook.setImage(R.mipmap.csharp);
        mBook.setPublishTime(2010);
        books.add(mBook);

        mBook = new Book();
        mBook.setBookName("Swift Developer Guide");
        mBook.setAuthor("Stewart");
        mBook.setImage(R.mipmap.cplus);
        mBook.setPublishTime(2009);
        books.add(mBook);

        mBook = new Book();
        mBook.setBookName("PHP Developer Guide");
        mBook.setAuthor("Jim");
        mBook.setImage(R.mipmap.html);
        mBook.setPublishTime(2008);
        books.add(mBook);

        mBook = new Book();
        mBook.setBookName("Objective-C Developer Guide");
        mBook.setAuthor("Robert");
        mBook.setImage(R.mipmap.cplus);
        mBook.setPublishTime(2007);
        books.add(mBook);

        mBook = new Book();
        mBook.setBookName("Javascript Developer Guide");
        mBook.setAuthor("Mat");
        mBook.setImage(R.mipmap.html);
        mBook.setPublishTime(2011);
        books.add(mBook);

        adapter = new MyAdapter(getActivity(), books);
        adapter.setClickListener(this);
        rv.setAdapter(adapter);
        return view;
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(getActivity(), "You clicked " + adapter.getItem(position).getPublishTime() + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}
