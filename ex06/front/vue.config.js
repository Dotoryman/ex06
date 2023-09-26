const { defineConfig } = require("@vue/cli-service");
module.exports = defineConfig({
    transpileDependencies: true,
    devServer: {
        proxy: {
            "/": {
                // 대상 서버의 ContextPath
                target: "http://localhost:8099",
                changeOrigin: true,
                ws: false, //웹소켓 끄기
            },
        },
    },
});
