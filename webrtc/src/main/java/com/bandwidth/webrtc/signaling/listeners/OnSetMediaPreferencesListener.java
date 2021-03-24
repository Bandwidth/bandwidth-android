package com.bandwidth.webrtc.signaling.listeners;

import com.bandwidth.webrtc.signaling.NullSessionException;
import com.bandwidth.webrtc.signaling.Signaling;

public interface OnSetMediaPreferencesListener {
    void onSetMediaPreferences(Signaling signaling) throws NullSessionException;
}