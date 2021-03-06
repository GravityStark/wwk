// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoomMsg.proto

package message;

public final class RoomMsgProto {
  private RoomMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code message.SysMsgType}
   */
  public enum SysMsgType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>JOIN = 1;</code>
     *
     * <pre>
     *加入游戏
     * </pre>
     */
    JOIN(0, 1),
    ;

    /**
     * <code>JOIN = 1;</code>
     *
     * <pre>
     *加入游戏
     * </pre>
     */
    public static final int JOIN_VALUE = 1;


    public final int getNumber() { return value; }

    public static SysMsgType valueOf(int value) {
      switch (value) {
        case 1: return JOIN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SysMsgType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<SysMsgType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SysMsgType>() {
            public SysMsgType findValueByNumber(int number) {
              return SysMsgType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return message.RoomMsgProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final SysMsgType[] VALUES = values();

    public static SysMsgType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private SysMsgType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:message.SysMsgType)
  }

  /**
   * Protobuf enum {@code message.GameMsgType}
   */
  public enum GameMsgType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SYSTEM = 1;</code>
     *
     * <pre>
     *系统
     * </pre>
     */
    SYSTEM(0, 1),
    /**
     * <code>PLAYER = 2;</code>
     *
     * <pre>
     *玩家
     * </pre>
     */
    PLAYER(1, 2),
    ;

    /**
     * <code>SYSTEM = 1;</code>
     *
     * <pre>
     *系统
     * </pre>
     */
    public static final int SYSTEM_VALUE = 1;
    /**
     * <code>PLAYER = 2;</code>
     *
     * <pre>
     *玩家
     * </pre>
     */
    public static final int PLAYER_VALUE = 2;


    public final int getNumber() { return value; }

    public static GameMsgType valueOf(int value) {
      switch (value) {
        case 1: return SYSTEM;
        case 2: return PLAYER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GameMsgType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<GameMsgType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GameMsgType>() {
            public GameMsgType findValueByNumber(int number) {
              return GameMsgType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return message.RoomMsgProto.getDescriptor().getEnumTypes().get(1);
    }

    private static final GameMsgType[] VALUES = values();

    public static GameMsgType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private GameMsgType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:message.GameMsgType)
  }

  /**
   * Protobuf enum {@code message.JoinerStatus}
   */
  public enum JoinerStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>WAIT = 1;</code>
     *
     * <pre>
     *等待
     * </pre>
     */
    WAIT(0, 1),
    /**
     * <code>READY = 2;</code>
     *
     * <pre>
     *准备
     * </pre>
     */
    READY(1, 2),
    /**
     * <code>LIVE = 3;</code>
     *
     * <pre>
     *存活
     * </pre>
     */
    LIVE(2, 3),
    /**
     * <code>DEAD = 4;</code>
     *
     * <pre>
     *死亡
     * </pre>
     */
    DEAD(3, 4),
    ;

    /**
     * <code>WAIT = 1;</code>
     *
     * <pre>
     *等待
     * </pre>
     */
    public static final int WAIT_VALUE = 1;
    /**
     * <code>READY = 2;</code>
     *
     * <pre>
     *准备
     * </pre>
     */
    public static final int READY_VALUE = 2;
    /**
     * <code>LIVE = 3;</code>
     *
     * <pre>
     *存活
     * </pre>
     */
    public static final int LIVE_VALUE = 3;
    /**
     * <code>DEAD = 4;</code>
     *
     * <pre>
     *死亡
     * </pre>
     */
    public static final int DEAD_VALUE = 4;


    public final int getNumber() { return value; }

    public static JoinerStatus valueOf(int value) {
      switch (value) {
        case 1: return WAIT;
        case 2: return READY;
        case 3: return LIVE;
        case 4: return DEAD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<JoinerStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<JoinerStatus>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<JoinerStatus>() {
            public JoinerStatus findValueByNumber(int number) {
              return JoinerStatus.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return message.RoomMsgProto.getDescriptor().getEnumTypes().get(2);
    }

    private static final JoinerStatus[] VALUES = values();

    public static JoinerStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private JoinerStatus(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:message.JoinerStatus)
  }

  /**
   * Protobuf enum {@code message.DeadReason}
   */
  public enum DeadReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>KILL = 1;</code>
     *
     * <pre>
     *狼杀
     * </pre>
     */
    KILL(0, 1),
    /**
     * <code>VOTE = 2;</code>
     *
     * <pre>
     *投票
     * </pre>
     */
    VOTE(1, 2),
    /**
     * <code>POISON = 3;</code>
     *
     * <pre>
     *毒杀
     * </pre>
     */
    POISON(2, 3),
    /**
     * <code>AWAY = 4;</code>
     *
     * <pre>
     *逃跑
     * </pre>
     */
    AWAY(3, 4),
    ;

    /**
     * <code>KILL = 1;</code>
     *
     * <pre>
     *狼杀
     * </pre>
     */
    public static final int KILL_VALUE = 1;
    /**
     * <code>VOTE = 2;</code>
     *
     * <pre>
     *投票
     * </pre>
     */
    public static final int VOTE_VALUE = 2;
    /**
     * <code>POISON = 3;</code>
     *
     * <pre>
     *毒杀
     * </pre>
     */
    public static final int POISON_VALUE = 3;
    /**
     * <code>AWAY = 4;</code>
     *
     * <pre>
     *逃跑
     * </pre>
     */
    public static final int AWAY_VALUE = 4;


    public final int getNumber() { return value; }

    public static DeadReason valueOf(int value) {
      switch (value) {
        case 1: return KILL;
        case 2: return VOTE;
        case 3: return POISON;
        case 4: return AWAY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DeadReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<DeadReason>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DeadReason>() {
            public DeadReason findValueByNumber(int number) {
              return DeadReason.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return message.RoomMsgProto.getDescriptor().getEnumTypes().get(3);
    }

    private static final DeadReason[] VALUES = values();

    public static DeadReason valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private DeadReason(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:message.DeadReason)
  }

  /**
   * Protobuf enum {@code message.RoomStatus}
   */
  public enum RoomStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>IDLE = 1;</code>
     *
     * <pre>
     *空闲
     * </pre>
     */
    IDLE(0, 1),
    /**
     * <code>RUNNING = 2;</code>
     *
     * <pre>
     *游戏中
     * </pre>
     */
    RUNNING(1, 2),
    ;

    /**
     * <code>IDLE = 1;</code>
     *
     * <pre>
     *空闲
     * </pre>
     */
    public static final int IDLE_VALUE = 1;
    /**
     * <code>RUNNING = 2;</code>
     *
     * <pre>
     *游戏中
     * </pre>
     */
    public static final int RUNNING_VALUE = 2;


    public final int getNumber() { return value; }

    public static RoomStatus valueOf(int value) {
      switch (value) {
        case 1: return IDLE;
        case 2: return RUNNING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RoomStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<RoomStatus>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RoomStatus>() {
            public RoomStatus findValueByNumber(int number) {
              return RoomStatus.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return message.RoomMsgProto.getDescriptor().getEnumTypes().get(4);
    }

    private static final RoomStatus[] VALUES = values();

    public static RoomStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private RoomStatus(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:message.RoomStatus)
  }

  /**
   * Protobuf enum {@code message.GameRole}
   */
  public enum GameRole
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ALLROLE = 0;</code>
     *
     * <pre>
     *所有角色
     * </pre>
     */
    ALLROLE(0, 0),
    /**
     * <code>WERWOLF = 1;</code>
     *
     * <pre>
     *狼人
     * </pre>
     */
    WERWOLF(1, 1),
    /**
     * <code>CIVILIAN = 2;</code>
     *
     * <pre>
     *平民
     * </pre>
     */
    CIVILIAN(2, 2),
    /**
     * <code>WITCH = 3;</code>
     *
     * <pre>
     *女巫
     * </pre>
     */
    WITCH(3, 3),
    /**
     * <code>HUNTER = 4;</code>
     *
     * <pre>
     *猎人
     * </pre>
     */
    HUNTER(4, 4),
    /**
     * <code>PROPHET = 5;</code>
     *
     * <pre>
     *预言家
     * </pre>
     */
    PROPHET(5, 5),
    ;

    /**
     * <code>ALLROLE = 0;</code>
     *
     * <pre>
     *所有角色
     * </pre>
     */
    public static final int ALLROLE_VALUE = 0;
    /**
     * <code>WERWOLF = 1;</code>
     *
     * <pre>
     *狼人
     * </pre>
     */
    public static final int WERWOLF_VALUE = 1;
    /**
     * <code>CIVILIAN = 2;</code>
     *
     * <pre>
     *平民
     * </pre>
     */
    public static final int CIVILIAN_VALUE = 2;
    /**
     * <code>WITCH = 3;</code>
     *
     * <pre>
     *女巫
     * </pre>
     */
    public static final int WITCH_VALUE = 3;
    /**
     * <code>HUNTER = 4;</code>
     *
     * <pre>
     *猎人
     * </pre>
     */
    public static final int HUNTER_VALUE = 4;
    /**
     * <code>PROPHET = 5;</code>
     *
     * <pre>
     *预言家
     * </pre>
     */
    public static final int PROPHET_VALUE = 5;


    public final int getNumber() { return value; }

    public static GameRole valueOf(int value) {
      switch (value) {
        case 0: return ALLROLE;
        case 1: return WERWOLF;
        case 2: return CIVILIAN;
        case 3: return WITCH;
        case 4: return HUNTER;
        case 5: return PROPHET;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GameRole>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<GameRole>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GameRole>() {
            public GameRole findValueByNumber(int number) {
              return GameRole.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return message.RoomMsgProto.getDescriptor().getEnumTypes().get(5);
    }

    private static final GameRole[] VALUES = values();

    public static GameRole valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private GameRole(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:message.GameRole)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rRoomMsg.proto\022\007message*\026\n\nSysMsgType\022\010" +
      "\n\004JOIN\020\001*%\n\013GameMsgType\022\n\n\006SYSTEM\020\001\022\n\n\006P" +
      "LAYER\020\002*7\n\014JoinerStatus\022\010\n\004WAIT\020\001\022\t\n\005REA" +
      "DY\020\002\022\010\n\004LIVE\020\003\022\010\n\004DEAD\020\004*6\n\nDeadReason\022\010" +
      "\n\004KILL\020\001\022\010\n\004VOTE\020\002\022\n\n\006POISON\020\003\022\010\n\004AWAY\020\004" +
      "*#\n\nRoomStatus\022\010\n\004IDLE\020\001\022\013\n\007RUNNING\020\002*V\n" +
      "\010GameRole\022\013\n\007ALLROLE\020\000\022\013\n\007WERWOLF\020\001\022\014\n\010C" +
      "IVILIAN\020\002\022\t\n\005WITCH\020\003\022\n\n\006HUNTER\020\004\022\013\n\007PROP" +
      "HET\020\005B\016B\014RoomMsgProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
