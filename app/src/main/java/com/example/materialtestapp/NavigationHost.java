package com.example.materialtestapp;

import android.support.v4.app.Fragment;

// прием повзаимствовани из коделаб Google
// интерфейс описывает метод подмены фрагмента у активити

/**
 * A host (typically an {@code Activity}} that can display fragments and knows how to respond to
 * navigation events.
 */
public interface NavigationHost {
    /**
     * Trigger a navigation to the specified fragment, optionally adding a transaction to the back
     * stack to make this navigation reversible.
     */
    void navigateTo(Fragment fragment, boolean addToBackstack);
}
