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

## 問題1

多角形の周長を計算する`calculatePerimeter`メソッドを作成してください．このメソッドは，以下の仕様を持つ`calculatePerimeter`メソッドをオーバーロードしてください．

1. **メソッド1**: 正方形の一辺の長さ（`double`型）を受け取り周長を返す
2. **メソッド2**: 長方形の幅と高さ（`double`型）を受け取り周長を返す
3. **メソッド3**: 三角形の3辺の長さ（`double`型）を受け取り周長を返す
4. **メソッド4**: 任意の辺の数とそれぞれの辺の長さを持つ多角形の周長を計算する

**条件**:

- `calculatePerimeter`メソッドはオーバーロードによって実装すること
- メソッド4では可変長引数を使用して辺の長さを受け取ること