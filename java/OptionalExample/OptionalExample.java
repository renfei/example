package net.renfei;

import java.util.Optional;

public class OptionalExample {

    public static class User {
        private BaseInfo baseInfo;

        public void setBaseInfo(BaseInfo baseInfo) {
            this.baseInfo = baseInfo;
        }

        public Optional<BaseInfo> getBaseInfo() {
            return Optional.ofNullable(this.baseInfo);
        }

        public static class BaseInfo {
            private String email;

            public void setEmail(String email) {
                this.email = email;
            }

            public Optional<String> getEmail() {
                return Optional.ofNullable(this.email);
            }
        }
    }

    public static void main(String[] args) {
        // 验证如果 user 为 null 的情况
        printEmail(null);
        // 验证如果 User.BaseInfo 为 null 的情况
        User user = new User();
        user.setBaseInfo(null);
        printEmail(user);
        // 验证如果 User.BaseInfo.Email 为 null 的情况
        User.BaseInfo baseInfo = new User.BaseInfo();
        baseInfo.setEmail(null);
        user.setBaseInfo(baseInfo);
        printEmail(user);
        // 验证正常情况
        baseInfo.setEmail("i@renfei.net");
        user.setBaseInfo(baseInfo);
        printEmail(user);
    }

    public static void printEmail(User user) {
        String defaultEmail = "Unknown Email";
        // user 是外部传入的，我们也不知道 User 是否为 null
        Optional<User> optionalUser = Optional.ofNullable(user);
        // 我们需要打印 User 的 Email，如果为 null，打印默认值
        System.out.println(optionalUser
                .flatMap(User::getBaseInfo)
                .flatMap(User.BaseInfo::getEmail)
                .orElse(defaultEmail));
    }
}
