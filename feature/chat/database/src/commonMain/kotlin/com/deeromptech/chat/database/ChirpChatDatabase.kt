package com.deeromptech.chat.database

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import com.deeromptech.chat.database.dao.ChatDao
import com.deeromptech.chat.database.dao.ChatMessageDao
import com.deeromptech.chat.database.dao.ChatParticipantDao
import com.deeromptech.chat.database.dao.ChatParticipantsCrossRefDao
import com.deeromptech.chat.database.entities.ChatEntity
import com.deeromptech.chat.database.entities.ChatMessageEntity
import com.deeromptech.chat.database.entities.ChatParticipantCrossRef
import com.deeromptech.chat.database.entities.ChatParticipantEntity
import com.deeromptech.chat.database.view.LastMessageView

@Database(
    entities = [
        ChatEntity::class,
        ChatParticipantEntity::class,
        ChatMessageEntity::class,
        ChatParticipantCrossRef::class,
    ],
    views = [
        LastMessageView::class
    ],
    version = 1,
)
@ConstructedBy(ChirpChatDatabaseConstructor::class)
abstract class ChirpChatDatabase: RoomDatabase() {
    abstract val chatDao: ChatDao
    abstract val chatParticipantDao: ChatParticipantDao
    abstract val chatMessageDao: ChatMessageDao
    abstract val chatParticipantsCrossRefDao: ChatParticipantsCrossRefDao

    companion object {
        const val DB_NAME = "chirp.db"
    }
}