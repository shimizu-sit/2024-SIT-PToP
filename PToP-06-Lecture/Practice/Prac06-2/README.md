## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## 課題

様々なパターンの文字列を生成する`generatePattern`メソッドを作成してください。このメソッドには，以下の仕様を持つ`generatePattern`メソッドをオーバーロードしてください．

1. **メソッド1**: 整数`n`を受け取り，`n`個のアスタリスク`*`を連続した文字列として返す
2. **メソッド2**: 文字`c`（char型）と整数`n`を受け取り，`n`個の文字`c`を連続した文字列として返す
3. **メソッド3**: 文字列`str`と整数`n`を受け取り，`str`を`n`回繰り返した文字列を返す
4. **メソッド4**: 整数`n`（nは1から10まで）を受け取り，`n`段の数字のピラミッドパターンを文字列として返す

### **条件**:

- `generatePattern`メソッドはオーバーロードによって実装すること
- メソッド4では，各段に対応する数字を繰り返して表示すること（例: 1段目は`1`，2段目は`22`，3段目は`333`）