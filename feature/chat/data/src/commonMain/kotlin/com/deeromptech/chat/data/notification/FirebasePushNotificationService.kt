package com.deeromptech.chat.data.notification

import com.deeromptech.chat.domain.notification.PushNotificationService
import kotlinx.coroutines.flow.Flow

expect class FirebasePushNotificationService: PushNotificationService {
    override fun observeDeviceToken(): Flow<String?>
}