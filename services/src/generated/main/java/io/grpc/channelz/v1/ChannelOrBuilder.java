// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/grpc/channelz.proto

package io.grpc.channelz.v1;

public interface ChannelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.channelz.Channel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The identifier for this channel.
   * </pre>
   *
   * <code>.grpc.channelz.ChannelRef ref = 1;</code>
   */
  boolean hasRef();
  /**
   * <pre>
   * The identifier for this channel.
   * </pre>
   *
   * <code>.grpc.channelz.ChannelRef ref = 1;</code>
   */
  io.grpc.channelz.v1.ChannelRef getRef();
  /**
   * <pre>
   * The identifier for this channel.
   * </pre>
   *
   * <code>.grpc.channelz.ChannelRef ref = 1;</code>
   */
  io.grpc.channelz.v1.ChannelRefOrBuilder getRefOrBuilder();

  /**
   * <pre>
   * Data specific to this channel.
   * </pre>
   *
   * <code>.grpc.channelz.ChannelData data = 2;</code>
   */
  boolean hasData();
  /**
   * <pre>
   * Data specific to this channel.
   * </pre>
   *
   * <code>.grpc.channelz.ChannelData data = 2;</code>
   */
  io.grpc.channelz.v1.ChannelData getData();
  /**
   * <pre>
   * Data specific to this channel.
   * </pre>
   *
   * <code>.grpc.channelz.ChannelData data = 2;</code>
   */
  io.grpc.channelz.v1.ChannelDataOrBuilder getDataOrBuilder();

  /**
   * <pre>
   * There are no ordering guarantees on the order of channel refs.
   * There may not be cycles in the ref graph.
   * A channel ref may be present in more than one channel or subchannel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.ChannelRef channel_ref = 3;</code>
   */
  java.util.List<io.grpc.channelz.v1.ChannelRef> 
      getChannelRefList();
  /**
   * <pre>
   * There are no ordering guarantees on the order of channel refs.
   * There may not be cycles in the ref graph.
   * A channel ref may be present in more than one channel or subchannel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.ChannelRef channel_ref = 3;</code>
   */
  io.grpc.channelz.v1.ChannelRef getChannelRef(int index);
  /**
   * <pre>
   * There are no ordering guarantees on the order of channel refs.
   * There may not be cycles in the ref graph.
   * A channel ref may be present in more than one channel or subchannel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.ChannelRef channel_ref = 3;</code>
   */
  int getChannelRefCount();
  /**
   * <pre>
   * There are no ordering guarantees on the order of channel refs.
   * There may not be cycles in the ref graph.
   * A channel ref may be present in more than one channel or subchannel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.ChannelRef channel_ref = 3;</code>
   */
  java.util.List<? extends io.grpc.channelz.v1.ChannelRefOrBuilder> 
      getChannelRefOrBuilderList();
  /**
   * <pre>
   * There are no ordering guarantees on the order of channel refs.
   * There may not be cycles in the ref graph.
   * A channel ref may be present in more than one channel or subchannel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.ChannelRef channel_ref = 3;</code>
   */
  io.grpc.channelz.v1.ChannelRefOrBuilder getChannelRefOrBuilder(
      int index);

  /**
   * <pre>
   * At most one of 'channel_ref+subchannel_ref' and 'socket' is set.
   * There are no ordering guarantees on the order of subchannel refs.
   * There may not be cycles in the ref graph.
   * A sub channel ref may be present in more than one channel or subchannel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.SubchannelRef subchannel_ref = 4;</code>
   */
  java.util.List<io.grpc.channelz.v1.SubchannelRef> 
      getSubchannelRefList();
  /**
   * <pre>
   * At most one of 'channel_ref+subchannel_ref' and 'socket' is set.
   * There are no ordering guarantees on the order of subchannel refs.
   * There may not be cycles in the ref graph.
   * A sub channel ref may be present in more than one channel or subchannel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.SubchannelRef subchannel_ref = 4;</code>
   */
  io.grpc.channelz.v1.SubchannelRef getSubchannelRef(int index);
  /**
   * <pre>
   * At most one of 'channel_ref+subchannel_ref' and 'socket' is set.
   * There are no ordering guarantees on the order of subchannel refs.
   * There may not be cycles in the ref graph.
   * A sub channel ref may be present in more than one channel or subchannel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.SubchannelRef subchannel_ref = 4;</code>
   */
  int getSubchannelRefCount();
  /**
   * <pre>
   * At most one of 'channel_ref+subchannel_ref' and 'socket' is set.
   * There are no ordering guarantees on the order of subchannel refs.
   * There may not be cycles in the ref graph.
   * A sub channel ref may be present in more than one channel or subchannel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.SubchannelRef subchannel_ref = 4;</code>
   */
  java.util.List<? extends io.grpc.channelz.v1.SubchannelRefOrBuilder> 
      getSubchannelRefOrBuilderList();
  /**
   * <pre>
   * At most one of 'channel_ref+subchannel_ref' and 'socket' is set.
   * There are no ordering guarantees on the order of subchannel refs.
   * There may not be cycles in the ref graph.
   * A sub channel ref may be present in more than one channel or subchannel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.SubchannelRef subchannel_ref = 4;</code>
   */
  io.grpc.channelz.v1.SubchannelRefOrBuilder getSubchannelRefOrBuilder(
      int index);

  /**
   * <pre>
   * There are no ordering guarantees on the order of sockets.
   * </pre>
   *
   * <code>repeated .grpc.channelz.SocketRef socket_ref = 5;</code>
   */
  java.util.List<io.grpc.channelz.v1.SocketRef> 
      getSocketRefList();
  /**
   * <pre>
   * There are no ordering guarantees on the order of sockets.
   * </pre>
   *
   * <code>repeated .grpc.channelz.SocketRef socket_ref = 5;</code>
   */
  io.grpc.channelz.v1.SocketRef getSocketRef(int index);
  /**
   * <pre>
   * There are no ordering guarantees on the order of sockets.
   * </pre>
   *
   * <code>repeated .grpc.channelz.SocketRef socket_ref = 5;</code>
   */
  int getSocketRefCount();
  /**
   * <pre>
   * There are no ordering guarantees on the order of sockets.
   * </pre>
   *
   * <code>repeated .grpc.channelz.SocketRef socket_ref = 5;</code>
   */
  java.util.List<? extends io.grpc.channelz.v1.SocketRefOrBuilder> 
      getSocketRefOrBuilderList();
  /**
   * <pre>
   * There are no ordering guarantees on the order of sockets.
   * </pre>
   *
   * <code>repeated .grpc.channelz.SocketRef socket_ref = 5;</code>
   */
  io.grpc.channelz.v1.SocketRefOrBuilder getSocketRefOrBuilder(
      int index);
}
