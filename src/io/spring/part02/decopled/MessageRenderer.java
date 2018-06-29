package io.spring.part02.decopled;

public interface MessageRenderer {
	void render();

	void setMessageProvider(MessageProvider provider);

	MessageProvider getMessageProvider();
}
