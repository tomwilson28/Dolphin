package com.dianping.paas.core.message.codec;

import com.dianping.paas.core.util.JsonUtil;

import java.io.IOException;

/**
 * 默认编码解码为json
 * <p/>
 * chao.yu@dianping.com
 * Created by yuchao on 2015/11/13 17:11.
 */

public class DefaultCodec implements Codec {
    public <T> String encode(T payload) throws IOException {
        return JsonUtil.toJson(payload);
    }

    public <T> T decode(String body, Class<T> clazz) throws IOException {
        return JsonUtil.toBean(body, clazz);
    }
}
