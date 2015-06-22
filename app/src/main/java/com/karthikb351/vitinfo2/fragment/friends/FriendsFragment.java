/*
 * VITacademics
 * Copyright (C) 2015  Gaurav Agerwala <gauravagerwala@gmail.com>
 * Copyright (C) 2015  Pulkit Juneja <pulkit.16296@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.karthikb351.vitinfo2.fragment.friends;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.karthikb351.vitinfo2.R;
import com.karthikb351.vitinfo2.adapter.RecyclerViewOnClickListener;
import com.karthikb351.vitinfo2.api.contract.Friend;

import java.util.ArrayList;

public class FriendsFragment extends Fragment {

    ArrayList<Friend> friends ;
    RecyclerView friendsRecyclerView;
    FriendsListAdapter adapter ;

    public FriendsFragment() {
        // Required empty public constructor
    }

    public static FriendsFragment newInstance() {
        FriendsFragment fragment = new FriendsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.friends_fragment, container, false);
        FriendsLayoutManager layoutManager = new FriendsLayoutManager();
        adapter = new FriendsListAdapter(getActivity(),friends);
        adapter.setOnclickListener(new RecyclerViewOnClickListener<Friend>() {
            @Override
            public void onItemClick(Friend data) {
                // on item click functionality
            }
        });
        friendsRecyclerView = (RecyclerView)view.findViewById(R.id.rvFriends);
        friendsRecyclerView.setLayoutManager(layoutManager);
        friendsRecyclerView.setAdapter(adapter);
        return view ;
    }

    public static class FriendsLayoutManager extends RecyclerView.LayoutManager {

        @Override
        public RecyclerView.LayoutParams generateDefaultLayoutParams() {

            return null;
        }

        @Override
        public void scrollToPosition(int position) {

        }

        @Override
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            super.onLayoutChildren(recycler, state);
        }
    }
}