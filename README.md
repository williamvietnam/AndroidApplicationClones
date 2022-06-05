#Author: William Giang Nguyen

Ứng dụng gồm 2 app độc lập gồm các chức năng tương tự nhau lấy cảm hứng từ stackoverflow vs kiến trúc khác nhau

1. Ứng dụng Android viết bằng Kotlin:
   1.1. Kiến trúc ứng dụng: MVVM + SingleActivity + Kotlin + NavigationComponent + AndroidX + Jetpack
   1.2. Quy tắc merge code: Src luôn luôn phải được viết trên branch dev_debug_kotlin và merge vào branch release_kotlin
   branch release_kotlin là nơi lưu trữ src của app Gbrains viết bằng Kotlin. Cuối cùng sau khi hoàn tất sẽ merge code vào branch release

2. Ứng dụng Android viết bằng Java:
   2.1. Kiến trúc ứng dụng: MVP + SingleActivity + Java + NavigationComponent + AndroidX + Jetpack
   2.2. Quy tắc merge code: Src luôn luôn phải được viết trên branch dev_debug_java và merge vào branch release_java
   branch release_java là nơi lưu trữ src của app Gbrains viết bằng Java. Cuối cùng sau khi hoàn tất sẽ merge code vào branch release

